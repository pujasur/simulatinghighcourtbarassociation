package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

import java.io.Serializable;
import java.time.LocalDate;

public class Courtschedule implements Serializable {
    int scheduleid;
    String caseid,casename;
    LocalDate date;

    public Courtschedule(int scheduleid, String caseid, String casename, LocalDate date) {
        this.scheduleid = scheduleid;
        this.caseid = caseid;
        this.casename = casename;
        this.date = date;
    }

    public int getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(int scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public String getCasename() {
        return casename;
    }

    public void setCasename(String casename) {
        this.casename = casename;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Courtschedule{" +
                "scheduleid=" + scheduleid +
                ", caseid='" + caseid + '\'' +
                ", casename='" + casename + '\'' +
                ", date=" + date +
                '}';
    }
}
