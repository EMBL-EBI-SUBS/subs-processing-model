package uk.ac.ebi.subs.processing;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Builder
public class ProcessingCertificateEnvelope {
    String submissionId;
    List<ProcessingCertificate> processingCertificates = new ArrayList<>();
    private String JWTToken;

    public ProcessingCertificateEnvelope() {
    }

    public ProcessingCertificateEnvelope(String submissionId) {
        this.submissionId = submissionId;
    }

    public ProcessingCertificateEnvelope(String submissionId, List<ProcessingCertificate> processingCertificates) {
        this.submissionId = submissionId;
        this.processingCertificates = processingCertificates;
    }
}
