package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import java.util.List;

public class TrackCaseStatus {
    private String caseId;
    private String advocateName;
    private String caseType;
    private String status; // Pending, Active, Dismissed, Completed
    private List<String> caseHistory;
    private String advocateNotes;
    private List<String> upcomingCourtDates;
    private List<String> relatedDocuments;

    // Constructor
    public TrackCaseStatus(String caseId, String advocateName, String caseType, String status,
                             List<String> caseHistory, String advocateNotes, List<String> upcomingCourtDates,
                             List<String> relatedDocuments) {
        this.caseId = caseId;
        this.advocateName = advocateName;
        this.caseType = caseType;
        this.status = status;
        this.caseHistory = caseHistory;
        this.advocateNotes = advocateNotes;
        this.upcomingCourtDates = upcomingCourtDates;
        this.relatedDocuments = relatedDocuments;
    }

    // Getters and Setters
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getAdvocateName() {
        return advocateName;
    }

    public void setAdvocateName(String advocateName) {
        this.advocateName = advocateName;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getCaseHistory() {
        return caseHistory;
    }

    public void setCaseHistory(List<String> caseHistory) {
        this.caseHistory = caseHistory;
    }

    public String getAdvocateNotes() {
        return advocateNotes;
    }

    public void setAdvocateNotes(String advocateNotes) {
        this.advocateNotes = advocateNotes;
    }

    public List<String> getUpcomingCourtDates() {
        return upcomingCourtDates;
    }

    public void setUpcomingCourtDates(List<String> upcomingCourtDates) {
        this.upcomingCourtDates = upcomingCourtDates;
    }

    public List<String> getRelatedDocuments() {
        return relatedDocuments;
    }

    public void setRelatedDocuments(List<String> relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
    }

    // Placeholder for retrieving detailed case information
    public String fetchCaseDetails() {
        return "Detailed view for Case ID: " + caseId + "\n" +
                "Advocate Name: " + advocateName + "\n" +
                "Status: " + status + "\n" +
                "Case History: " + String.join(", ", caseHistory) + "\n" +
                "Advocate Notes: " + advocateNotes + "\n" +
                "Upcoming Court Dates: " + String.join(", ", upcomingCourtDates) + "\n" +
                "Related Documents: " + String.join(", ", relatedDocuments);
    }
}