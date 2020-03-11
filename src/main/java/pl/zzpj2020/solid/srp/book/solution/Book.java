package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {

    private Map<Integer, String> pages = new HashMap<>();
    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;

    public String getTitle() {
        return "A Great Book";
    }

    public String getAuthor() {
        return "John Doe";
    }

    public String libraryRoomName() {
        return libraryRoomName;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    public Map<Integer, String> getPages() {
        return pages;
    }
}
