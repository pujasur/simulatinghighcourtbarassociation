package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import java.io.File;

public class CreateNewCasesAndAddDetails {
    private String clientName;
    private String caseType;
    private String caseDescription;
    private File document;

    // Constructor
    public CreateNewCasesAndAddDetails(String clientName, String caseType, String caseDescription) {
        this.clientName = clientName;
        this.caseType = caseType;
        this.caseDescription = caseDescription;
        this.document = null; // Initialize with no document
    }

    // Getters and Setters
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCaseDescription() {
        return caseDescription;
    }

    public void setCaseDescription(String caseDescription) {
        this.caseDescription = caseDescription;
    }

    public File getDocument() {
        return document;
    }

    public void setDocument(File document) {
        this.document = document;
    }
}