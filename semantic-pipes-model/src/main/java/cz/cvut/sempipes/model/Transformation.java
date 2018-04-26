
package cz.cvut.sempipes.model;

import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.CommonVocabulary;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.sempipes.Vocabulary;


/**
 * This class was generated by the OWL2Java tool version $VERSION$
 * 
 */
@OWLClass(iri = Vocabulary.s_c_transformation)
public class Transformation
    extends Thing
{

    @OWLAnnotationProperty(iri = CommonVocabulary.RDFS_LABEL)
    protected String name;
    @OWLAnnotationProperty(iri = CommonVocabulary.DC_DESCRIPTION)
    protected String description;
    @Types
    protected Set<String> types;
    @Id(generated = true)
    protected String id;
    @Properties
    protected Map<String, Set<Object>> properties;
    @OWLObjectProperty(iri = Vocabulary.s_p_has_input)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_source_dataset_snapshot, max = 1)
    })
    protected SourceDatasetSnapshot has_input;
    @OWLObjectProperty(iri = Vocabulary.s_p_has_output)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_target_dataset_snapshot, max = 1)
    })
    protected Set<Thing> has_output;
    @OWLObjectProperty(iri = Vocabulary.s_p_inv_dot_is_created_by)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_execution_context_dataset_source, max = 1)
    })
    protected ExecutionContextDatasetSource inv_dot_is_created_by;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setProperties(Map<String, Set<Object>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<Object>> getProperties() {
        return properties;
    }

    public void setHas_input(SourceDatasetSnapshot has_input) {
        this.has_input = has_input;
    }

    public SourceDatasetSnapshot getHas_input() {
        return has_input;
    }

    public void setHas_output(Set<Thing> has_output) {
        this.has_output = has_output;
    }

    public Set<Thing> getHas_output() {
        return has_output;
    }

    public void setInv_dot_is_created_by(ExecutionContextDatasetSource inv_dot_is_created_by) {
        this.inv_dot_is_created_by = inv_dot_is_created_by;
    }

    public ExecutionContextDatasetSource getInv_dot_is_created_by() {
        return inv_dot_is_created_by;
    }

}
