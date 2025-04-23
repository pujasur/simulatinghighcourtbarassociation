package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import java.io.Serializable;

public class Investments implements Serializable {
    int investmentid;
    String fundname,returnrate;
    float amount;

    public Investments(int investmentid, String fundname, String returnrate, float amount) {
        this.investmentid = investmentid;
        this.fundname = fundname;
        this.returnrate = returnrate;
        this.amount = amount;
    }

    public int getInvestmentid() {
        return investmentid;
    }

    public void setInvestmentid(int investmentid) {
        this.investmentid = investmentid;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        this.fundname = fundname;
    }

    public String getReturnrate() {
        return returnrate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setReturnrate(String returnrate) {
        this.returnrate = returnrate;
    }

    @Override
    public String toString() {
        return "Investments{" +
                "investmentid=" + investmentid +
                ", fundname='" + fundname + '\'' +
                ", returnrate='" + returnrate + '\'' +
                ", amount=" + amount +
                '}';
    }
}
