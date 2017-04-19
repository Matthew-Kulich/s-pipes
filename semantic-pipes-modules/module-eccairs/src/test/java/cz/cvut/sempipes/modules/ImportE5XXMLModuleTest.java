package cz.cvut.sempipes.modules;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.List;

/**
 * Created by Miroslav Blasko on 28.11.16.
 */
@RunWith(Parameterized.class)
public class ImportE5XXMLModuleTest extends ImportE5XModuleTest {

    public ImportE5XXMLModuleTest(String path, String contentType) {
        super(path, contentType);
    }

    @Parameterized.Parameters(name="e5x")
    public static Object[] generateTestData() {
        String dir = "data/e5x.xml";
        String contentType = "text/xml";

        List<String> files = null;
        try {
            files = IOUtils.readLines((ImportE5XXMLModuleTest.class.getClassLoader().getResourceAsStream(dir)), Charsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return files.stream().map((file) -> new Object[]{"/" + dir + "/" + file, contentType}).toArray();
    }

    @Override
    @Test
    public void execute() {
        super.execute();
    }
}
