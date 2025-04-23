package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import java.io.Serializable;

public class Refundrequest implements Serializable {
    int requestid,memberid;
    String status;
    float amount;

    public Refundrequest(int requestid, int memberid, String status, float amount) {
        this.requestid = requestid;
        this.memberid = memberid;
        this.status = status;
        this.amount = amount;
    }

    public int getMemberid() {
        return memberid;
    }


    public int getRequestid() {
        return requestid;
    }

    public void setRequestid(int requestid) {
        this.requestid = requestid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    @Override
    public String toString() {
        return "Refundrequest{" +
                "requestid=" + requestid +
                ", memberid=" + memberid +
                ", memberid='" + memberid + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }
}
