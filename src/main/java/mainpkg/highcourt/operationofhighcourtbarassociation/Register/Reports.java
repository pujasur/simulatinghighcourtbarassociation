package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

import java.io.Serializable;
import java.time.LocalDate;

public class Reports implements Serializable {
    int reportid;
    String subject,description;
    LocalDate date;

    public Reports(int reportid, String subject, String description, LocalDate date) {
        this.reportid = reportid;
        this.subject = subject;
        this.description = description;
        this.date = date;
    }

    public int getReportid() {
        return reportid;
    }

    public void setReportid(int reportid) {
        this.reportid = reportid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reports{" +
                "reportid=" + reportid +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
