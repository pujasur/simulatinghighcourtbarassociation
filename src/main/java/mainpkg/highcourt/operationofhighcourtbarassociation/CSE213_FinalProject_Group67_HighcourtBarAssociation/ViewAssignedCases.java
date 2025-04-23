package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

public class ViewAssignedCases {
    private String caseId;
    private String clientName;
    private String caseType;
    private String caseStatus;

    // Constructor
    public ViewAssignedCases(String caseId, String clientName, String caseType, String caseStatus) {
        this.caseId = caseId;
        this.clientName = clientName;
        this.caseType = caseType;
        this.caseStatus = caseStatus;
    }

    // Getters
    public String getCaseId() {
        return caseId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getCaseType() {
        return caseType;
    }

    public String getCaseStatus() {
        return caseStatus;
    }
}