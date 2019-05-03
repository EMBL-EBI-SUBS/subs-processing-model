package uk.ac.ebi.subs.processing;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProcessingCertificateEnvelope {
    String submissionId;

    List<ProcessingCertificate> processingCertificates = new ArrayList<>();
    private String JWTToken;

    public ProcessingCertificateEnvelope() {
    }

    public ProcessingCertificateEnvelope(String submissionId) {
        this.submissionId = submissionId;
    }

    public ProcessingCertificateEnvelope(String submissionId, List<ProcessingCertificate> processingCertificates,
                                         String jwtToken) {
        this.submissionId = submissionId;
        this.processingCertificates = processingCertificates;
        this.JWTToken = jwtToken;
    }
}
