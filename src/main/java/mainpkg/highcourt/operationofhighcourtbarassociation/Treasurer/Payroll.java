package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import java.io.Serializable;
import java.time.LocalDate;

public class Payroll implements Serializable {
    int employeeid;
    float salary,deductions;
    LocalDate date;

    public Payroll(int employeeid, float salary, float deductions, LocalDate date) {
        this.employeeid = employeeid;
        this.salary = salary;
        this.deductions = deductions;
        this.date = date;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getDeductions() {
        return deductions;
    }

    public void setDeductions(float deductions) {
        this.deductions = deductions;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "employeeid=" + employeeid +
                ", salary=" + salary +
                ", deductions=" + deductions +
                ", date=" + date +
                '}';
    }
}
