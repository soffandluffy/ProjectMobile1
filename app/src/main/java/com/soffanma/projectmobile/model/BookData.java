package com.soffanma.projectmobile.model;

import java.util.ArrayList;

public class BookData {
    public static String[][] data = new String[][]{
            {"The Fellowship of the Ring", "J.R.R Tolkien", "https://covers.openlibrary.org/b/id/10210983-L.jpg"},
            {"The Two Towers", "J.R.R Tolkien", "https://covers.openlibrary.org/b/id/8478177-L.jpg"},
            {"THE RETURN OF THE KING", "J.R.R Tolkien", "https://covers.openlibrary.org/b/id/8142471-L.jpg"},
            {"Harry Potter and the Philosopher's Stone", "J.K. Rowling", "https://covers.openlibrary.org/b/id/8267048-L.jpg"},
            {"Harry Potter and the Chamber of Secrets", "J.K. Rowling", "https://covers.openlibrary.org/b/id/8392830-L.jpg"},
            {"Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", "https://covers.openlibrary.org/b/id/8128974-L.jpg"},
            {"Harry Potter and the Goblet of Fire", "J.K. Rowling", "https://covers.openlibrary.org/b/id/9256154-L.jpg"},
            {"Harry Potter and the Half-Blood Prince", "J.K. Rowling", "https://covers.openlibrary.org/b/id/8235163-L.jpg"},
            {"Harry Potter and the Deathly Hallows", "J.K. Rowling", "https://covers.openlibrary.org/b/id/8183590-L.jpg"},
            {"Harry Potter and the Order of the Phoenix", "J.K. Rowling", "https://covers.openlibrary.org/b/id/7350715-L.jpg"},
    };
    public static ArrayList<Book> getListData(){
        ArrayList<Book> list = new ArrayList<>();
        for (String[] aData : data) {
            Book book = new Book();
            book.setName(aData[0]);
            book.setAuthor(aData[1]);
            book.setPhoto(aData[2]);
            list.add(book);
        }
        return list;
    }
}
