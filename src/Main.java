public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Bella", "14/09/1923");
        System.out.println(worker);
        worker.terminate("27/11/2023");
        System.out.println(worker);
        System.out.println("Bella has earned: "  + worker.collectPay());
        System.out.println("Bella's age is: " + worker.getAge());
        System.out.println("---------------");

        Employee employee = new Employee("Tim", "12/12/1986",  "26/11/2023");
        System.out.println(employee);
        employee.terminate("01/12/2023");
        System.out.println(employee);
        System.out.println("Tim has earned: "  + employee.collectPay());
        System.out.println("Tim's age is: " + employee.getAge());
        System.out.println("---------------");

        SalariedEmployee salariedEmployee = new SalariedEmployee("Dave", "13/02/1908", "28/01/2024", 23000d);
        System.out.println(salariedEmployee);
        System.out.println("Dave has earned: "  + salariedEmployee.collectPay());
        salariedEmployee.retire();
        System.out.println(salariedEmployee);
        System.out.println("Dave's retirement pay is: "  + salariedEmployee.collectPay());
        System.out.println("Dave's age is: " + salariedEmployee.getAge());
        System.out.println("---------------");

        Worker badWorker = new Worker();
        System.out.println(badWorker);
        System.out.println("Bad Workers's age is: " + badWorker.getAge());
        System.out.println("---------------");

    }
}