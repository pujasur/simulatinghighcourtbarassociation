package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import java.io.Serializable;
import java.time.LocalDate;

public class Fincialreport implements Serializable {
    int reportid;
    String type,period,path;
    LocalDate date;

    public Fincialreport(int reportid, String type, String period, String path, LocalDate date) {
        this.reportid = reportid;
        this.type = type;
        this.period = period;
        this.path = path;
        this.date = date;
    }

    public int getReportid() {
        return reportid;
    }

    public void setReportid(int reportid) {
        this.reportid = reportid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Fincialreport{" +
                "reportid=" + reportid +
                ", type='" + type + '\'' +
                ", period='" + period + '\'' +
                ", path='" + path + '\'' +
                ", date=" + date +
                '}';
    }
}
