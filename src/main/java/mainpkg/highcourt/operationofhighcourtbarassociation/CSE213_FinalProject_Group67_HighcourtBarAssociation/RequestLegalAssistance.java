package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import java.util.List;

public class RequestLegalAssistance {
    private String fullName;
    private String contactInformation;
    private String caseType;
    private String caseDescription;
    private List<String> supportingDocuments;

    // Constructor
    public RequestLegalAssistance(String fullName, String contactInformation, String caseType, String caseDescription, List<String> supportingDocuments) {
        this.fullName = fullName;
        this.contactInformation = contactInformation;
        this.caseType = caseType;
        this.caseDescription = caseDescription;
        this.supportingDocuments = supportingDocuments;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
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

    public List<String> getSupportingDocuments() {
        return supportingDocuments;
    }

    public void setSupportingDocuments(List<String> supportingDocuments) {
        this.supportingDocuments = supportingDocuments;
    }

    // Placeholder for assigning an advocate
    public String assignAdvocate() {
        return "An advocate will be assigned based on availability and expertise.";
    }

    // Placeholder for validation
    public boolean validateInput() {
        return fullName != null && !fullName.isEmpty() &&
                contactInformation != null && !contactInformation.isEmpty() &&
                caseType != null && !caseType.isEmpty() &&
                caseDescription != null && !caseDescription.isEmpty();
    }
}