package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import java.io.File;

public class CollaborateWithExternalPartners {
    private String caseId;
    private String partnerType;
    private String message;
    private File attachedDocument;

    // Constructor
    public CollaborateWithExternalPartners(String caseId, String partnerType, String message) {
        this.caseId = caseId;
        this.partnerType = partnerType;
        this.message = message;
        this.attachedDocument = null; // Initialize with no document
    }

    // Getters and Setters
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public File getAttachedDocument() {
        return attachedDocument;
    }

    public void setAttachedDocument(File attachedDocument) {
        this.attachedDocument = attachedDocument;
    }
}