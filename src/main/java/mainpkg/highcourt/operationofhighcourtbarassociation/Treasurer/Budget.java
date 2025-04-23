package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import java.io.Serializable;

public class Budget implements Serializable {
    int budgetid;
    String category;
    float allocatedamount,balance;

    public Budget(int budgetid, String category, float allocatedamount, float balance) {
        this.budgetid = budgetid;
        this.category = category;
        this.allocatedamount = allocatedamount;
        this.balance = balance;
    }

    public int getBudgetid() {
        return budgetid;
    }

    public void setBudgetid(int budgetid) {
        this.budgetid = budgetid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getAllocatedamount() {
        return allocatedamount;
    }

    public void setAllocatedamount(float allocatedamount) {
        this.allocatedamount = allocatedamount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "budgetid=" + budgetid +
                ", category='" + category + '\'' +
                ", allocatedamount=" + allocatedamount +
                ", balance=" + balance +
                '}';
    }
}
