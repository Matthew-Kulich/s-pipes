package cz.cvut.spipes.modules.model;

import cz.cvut.kbss.jopa.model.annotations.*;
import cz.cvut.spipes.constants.CSVW;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents the custom tabular metadata (according to relevant W3C standard)
 * that are provided to tabular module as an input model.
 */
@OWLClass(iri = CSVW.TableSchemaUri)
public class TableSchema extends AbstractEntity {

    @OWLAnnotationProperty(iri = CSVW.aboutUrlUri)
    private String aboutUrl;

    @OWLAnnotationProperty(iri = CSVW.propertyUrlUri)
    private String propertyUrl;

    @OWLAnnotationProperty(iri = CSVW.valueUrlUri)
    private String valueUrl;

    @OWLObjectProperty(iri = CSVW.uri + "column", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Column> columnsSet = new HashSet<>();

    public String getAboutUrl() {
        return aboutUrl;
    }

    public void setAboutUrl(String aboutUrl) {
        this.aboutUrl = aboutUrl;
    }

    public String getPropertyUrl() {
        return propertyUrl;
    }

    public void setPropertyUrl(String propertyUrl) {
        this.propertyUrl = propertyUrl;
    }

    public String getValueUrl() {
        return valueUrl;
    }

    public void setValueUrl(String valueUrl) {
        this.valueUrl = valueUrl;
    }

    public Set<Column> getColumnsSet() {
        return columnsSet;
    }

    public void setColumnsSet(Set<Column> columnsSet) {
        this.columnsSet = columnsSet;
    }
}
