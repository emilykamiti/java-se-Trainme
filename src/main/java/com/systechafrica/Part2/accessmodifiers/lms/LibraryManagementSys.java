package com.systechafrica.Part2.accessmodifiers.lms;

public abstract class LibraryManagementSys {
    public static void main(String[] args) {
        Book book = new Book();
        book.isbn = " 8u368989740918-";
        book.title = "java programming";
        book.printBookDetails();
    }
}
