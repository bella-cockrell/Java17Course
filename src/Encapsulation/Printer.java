package Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        System.out.println("Is it a duplex? " + this.duplex);
    }
    public int addToner(int tonerAmount) {
        int totalToner = this.tonerLevel + tonerAmount;
        if (totalToner > 100 || totalToner < 0) {
            System.out.println("Too much toner. Toner amount is: " + this.tonerLevel);
            return -1;
        } else {
            this.tonerLevel += tonerAmount;
            System.out.println("Successfully added. Toner amount is: " + this.tonerLevel);
            return this.tonerLevel;
        }
    }

    public int printPages(int pages) {
        int jobPages = duplex ? (pages/2) + (pages%2) : pages;
        this.pagesPrinted += jobPages;
        return jobPages;
    }
}