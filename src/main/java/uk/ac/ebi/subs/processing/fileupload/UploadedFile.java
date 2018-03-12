package uk.ac.ebi.subs.processing.fileupload;

import lombok.Data;

@Data
public class UploadedFile {

    private String filename;

    private String path;

    private String submissionId;

    private long totalSize;

    private String checksum;
}
