package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

public class ClientViewApproveorReject {
    private String documentName;
    private String documentType;
    private String uploadDate;
    private boolean isApproved;
    private String rejectionReason;

    // Constructor
    public ClientViewApproveorReject(String documentName, String documentType, String uploadDate) {
        this.documentName = documentName;
        this.documentType = documentType;
        this.uploadDate = uploadDate;
        this.isApproved = false; // Default status is not approved
        this.rejectionReason = ""; // Default no rejection reason
    }

    // Getters and Setters
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    @Override
    public String toString() {
        return documentName + " (" + documentType + ", " + uploadDate + ")";
    }
}