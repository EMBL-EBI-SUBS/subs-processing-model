package uk.ac.ebi.subs.processing.fileupload;

import lombok.Data;

@Data
public class UploadedFile {

    private String id;

    private String generatedTusId;

    private String filename;

    private String uploadPath;

    private String targetPath;

    private String submissionId;

    private long totalSize;

    private long uploadedSize;

    private String createdBy;

    private FileStatus status;

    private String checksum;
}
