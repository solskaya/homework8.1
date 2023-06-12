package org.example;

public class Book extends Publication implements Printable {


    public Book() {
        this(null);
    }

    public Book(String name) {
        super(name);
    }

    public static void printBooks(Printable[] printable) {
        for (var p : printable) {
            if (p instanceof Book book) {
                System.out.println("Book: " + book.getName());
            }
        }
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("Book \"" + this.getName() + "\" is printed");
    }

}
