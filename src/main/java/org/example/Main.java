package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        Printable[] printables = {
                new Book("Java"),
                new Book("HTML"),
                new Book("CSS"),
                new Magazine("Vogue"),
                new Magazine("Forbes"),
                new Magazine("People")};

        Printable.printArrayOfPrintable(printables);
        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}