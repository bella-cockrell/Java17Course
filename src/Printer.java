public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this(tonerLevel, 0, duplex);
        System.out.println("Is it a duplex? " + this.duplex);
        System.out.println("Toner level is: " + this.tonerLevel);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if (tonerLevel > 100) {
            this.tonerLevel = 100;
        } else if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int totalToner = this.tonerLevel + tonerAmount;
        if (totalToner > 100) {
            System.out.println("Too much toner. Toner amount is: " + this.tonerLevel);
            return -1;
        } else if (totalToner < 0) {
            System.out.println("Too little toner. Toner amount is: " + this.tonerLevel);
            return -1;
        } else {
            this.tonerLevel += tonerAmount;
            System.out.println("Successfully added. Toner amount is: " + this.tonerLevel);
            return this.tonerLevel;
        }
    }

    public int printPages(int pages) {
        System.out.println("Total pages printed so far: " + this.pagesPrinted);
        if (duplex) {
            int pagesPrinted = (int)Math.ceil((double)pages / 2);
            this.pagesPrinted += pagesPrinted;
            System.out.println("Duplex pages printed: " + pagesPrinted);
            System.out.println("Pages printed: " + this.pagesPrinted);
            return pagesPrinted;
        } else {
            this.pagesPrinted += pages;
            System.out.println("Total pages printed after printing: " + this.pagesPrinted);
            return pages;
        }
    }
}
