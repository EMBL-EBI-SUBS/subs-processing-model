package uk.ac.ebi.subs.processing;

import lombok.Data;

import java.util.List;

@Data
public class AccessionIdEnvelope {

    private String bioStudiesAccessionId;
    private List<String> bioSamplesAccessionIds;

}
