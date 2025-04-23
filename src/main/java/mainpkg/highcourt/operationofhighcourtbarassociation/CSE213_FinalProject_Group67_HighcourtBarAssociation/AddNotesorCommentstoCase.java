package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

public class AddNotesorCommentstoCase {
    private String caseId;
    private String clientName;
    private String caseType;
    private String caseStatus;
    private String note;

    // Constructor
    public AddNotesorCommentstoCase(String caseId, String clientName, String caseType, String caseStatus) {
        this.caseId = caseId;
        this.clientName = clientName;
        this.caseType = caseType;
        this.caseStatus = caseStatus;
        this.note = ""; // Initialize with an empty note
    }

    // Getters and Setters
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

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

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}