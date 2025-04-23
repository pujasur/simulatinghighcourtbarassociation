package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import java.time.LocalDate;

public class AnalyzeCaseOutcomesAndGeneratingReportsViewController {
    private String reportType;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String caseType;

    public AnalyzeCaseOutcomesAndGeneratingReportsViewController(String reportType, LocalDate fromDate, LocalDate toDate, String caseType) {
        this.reportType = reportType;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.caseType = caseType;
    }

    // Getters and Setters
    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    // Placeholder for analytics logic
    public String generateAnalytics() {
        return "Analytics generated for report type: " + reportType + ", case type: " + caseType + ", from " + fromDate + " to " + toDate;
    }
}