package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import java.io.Serializable;
import java.time.LocalDate;

public class Payment implements Serializable {
    int paymentid,memberid;
    String paymentmethod;
    float amount;
    LocalDate date;

    public Payment(int paymentid, String paymentmethod, int memberid, float amount, LocalDate date) {
        this.paymentid = paymentid;
        this.paymentmethod = paymentmethod;
        this.memberid = memberid;
        this.amount = amount;
        this.date = date;
    }

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentid=" + paymentid +
                ", memberid=" + memberid +
                ", paymentmethod='" + paymentmethod + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
