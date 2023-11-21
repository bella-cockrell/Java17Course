
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        printer.addToner(49);
        printer.addToner(20);
        printer.printPages(5);

        Printer duplexPrinter = new Printer(99, true);
        duplexPrinter.printPages(5);
        duplexPrinter.printPages(2);

        Printer tooLittleInkPrinter = new Printer(-1, false);
        Printer tooMuchInkPrinter = new Printer(101, false);
    }
}