public class Worker {
    private String name;
    private String birthDate;
    private String endDate; //why no compiler error if endDate is being changed? Should be protected not private

    public Worker() {
        this("Unknown name", "Unknown birthday");
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = null;
    }

    public int getAge() {
        if (birthDate.contains("Unknown")) {
            System.out.println("Unknown age");
            return -1;
        } else {
            String year = birthDate.substring(birthDate.length() - 4, birthDate.length());
            System.out.println(year);
            int thisYear = 2023;
            return thisYear - Integer.valueOf(year);
        }
    }

    public double collectPay() {
        return 0d;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
