
public class Main {
    public static void main(String[] args) {
        Encapsulation.Printer printer = new Encapsulation.Printer(50, false);
        printer.addToner(49);
        printer.addToner(20);
        printer.printPages(5);

        Encapsulation.Printer duplexPrinter = new Encapsulation.Printer(99, true);
        duplexPrinter.printPages(5);
        duplexPrinter.printPages(2);

        Encapsulation.Printer tooLittleInkPrinter = new Encapsulation.Printer(-1, false);
        Encapsulation.Printer tooMuchInkPrinter = new Encapsulation.Printer(101, false);
    }
}