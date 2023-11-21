package Inheritance;

import Inheritance.Employee;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire() {
        String someDate = "12/12/2024";
        this.terminate(someDate);
        //not accurate but fine for this example
        this.isRetired = true;
    }

    @Override
    public double collectPay() {
        double pay = this.annualSalary / 12;
        double retirementPay = pay * 0.9;
        return isRetired ? retirementPay : pay;
    }

    @Override
    public String toString() {
        return "Inheritance.SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}' + super.toString();
    }
}
