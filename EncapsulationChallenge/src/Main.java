public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer printer=new Printer(50,false);
        System.out.println("Initial page count = "+printer.getNumberOfPagesPrinted());
        int pagesPrinted=printer.printPages(4);
        System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer = "+printer.getNumberOfPagesPrinted());
        pagesPrinted=printer.printPages(2);
        System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer = "+printer.getNumberOfPagesPrinted());

    }



}
