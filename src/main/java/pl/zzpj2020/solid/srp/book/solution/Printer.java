package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class Printer {

    private Book bookToPrint = new Book();
    private int currentPage = 0;

    public String getCurrentPageContents() {
        return bookToPrint.getPages().get(currentPage);
    }

    public void printCurrentPage() {
        System.out.println(bookToPrint.getPages().get(currentPage));
    }

    public void turnPage() {
        currentPage ++;
    }
    public String printAllPages() {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : bookToPrint.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
