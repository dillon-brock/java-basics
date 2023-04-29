public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        this.tonerLevel += tonerAmount;
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        }
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int newPages = this.duplex ? (int) Math.ceil(pages / 2) : pages;
        this.pagesPrinted += newPages;
        if (this.duplex)
            System.out.println("This is a duplex printer, so it will print double-sided.");
        return newPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
