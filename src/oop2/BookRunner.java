package oop2;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(123, "Object Oriented Programming with Java" , "Bug");
        book.addReview(new Review(10, "Great book", 5));
        book.addReview(new Review(101, "Awesome", 5));

        System.out.println(book);
    }
}
