package Section7.EncapsulationChallenge;

public class Printer {

    private int tonerLevel = 0;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;

        this.pagesPrinted = 0;
    }

    public void fillUp(int toner) {

        int remainingToner = toner;
        while ((tonerLevel < 100) && (remainingToner > 0)) {
            tonerLevel++;
            remainingToner--;
        }
        System.out.println("Current toner level: " + tonerLevel + "%");
        System.out.println("Toner left outside: " + remainingToner + "%");
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("The printer is duplex");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
