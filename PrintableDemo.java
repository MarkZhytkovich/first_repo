public class PrintableDemo {
    public static void main(String [] args) {
        Printable[] printables = new Printable[2];
        printables[0] = new Book();
        printables[1] = new Magazine();
        for(Printable printable : printables) {
            printable.print();
        }
    }
}
