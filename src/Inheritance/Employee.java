package Inheritance;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    private static long employeeNumber = 1L; //allows you to share state among all instances

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNumber++;
        this.hireDate = hireDate;
    }

    @Override
    public double collectPay() {
        return 20d;
    }

    @Override
    public String toString() {
        return "Inheritance.Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}' + super.toString();
    }
}
