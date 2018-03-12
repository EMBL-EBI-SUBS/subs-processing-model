package uk.ac.ebi.subs.processing.fileupload;

/**
 * An enumerated list of {@link UploadedFile} statuses.
 */
public enum FileStatus {
    INITIALIZED, UPLOADING, UPLOADED, READY_FOR_CHECKSUM, READY_FOR_ARCHIVE, MARK_FOR_DELETION
}
