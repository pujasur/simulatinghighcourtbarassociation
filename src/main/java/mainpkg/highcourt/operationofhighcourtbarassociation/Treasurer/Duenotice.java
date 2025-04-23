package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import java.io.Serializable;
import java.time.LocalDate;

public class Duenotice implements Serializable {
    int noticeid,memberid;
    float dueamount;
    String status;
    LocalDate date;

    public Duenotice(int noticeid, float dueamount, int memberid, String status, LocalDate date) {
        this.noticeid = noticeid;
        this.dueamount = dueamount;
        this.memberid = memberid;
        this.status = status;
        this.date = date;
    }

    public int getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(int noticeid) {
        this.noticeid = noticeid;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public float getDueamount() {
        return dueamount;
    }

    public void setDueamount(float dueamount) {
        this.dueamount = dueamount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Duenotice{" +
                "noticeid=" + noticeid +
                ", memberid=" + memberid +
                ", dueamount=" + dueamount +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
