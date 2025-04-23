package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import java.io.Serializable;
import java.time.LocalDate;

public class Bankstatement implements Serializable {
    int statementid;
    String bankname;
    float balance;
    LocalDate date;

    public Bankstatement(int statementid, String bankname, float balance, LocalDate date) {
        this.statementid = statementid;
        this.bankname = bankname;
        this.balance = balance;
        this.date = date;
    }

    public int getStatementid() {
        return statementid;
    }

    public void setStatementid(int statementid) {
        this.statementid = statementid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bankstatement{" +
                "statementid=" + statementid +
                ", bankname='" + bankname + '\'' +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }
}
