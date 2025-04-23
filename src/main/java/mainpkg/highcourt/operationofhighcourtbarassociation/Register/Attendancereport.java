package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

import java.io.Serializable;
import java.time.LocalDate;

public class Attendancereport implements Serializable {
    int reportid;
    String records;
    LocalDate date;

    public Attendancereport(int reportid, String records, LocalDate date) {
        this.reportid = reportid;
        this.records = records;
        this.date = date;
    }

    public int getReportid() {
        return reportid;
    }

    public void setReportid(int reportid) {
        this.reportid = reportid;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Attendancereport{" +
                "reportid=" + reportid +
                ", records='" + records + '\'' +
                ", date=" + date +
                '}';
    }
}
