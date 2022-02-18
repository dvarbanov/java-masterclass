package Section7.EncapsulationChallenge;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed: " + pagesPrinted);
        System.out.println("New total print count: " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("New total print count: " + printer.getPagesPrinted());

        printer.fillUp(60);

    }
}
