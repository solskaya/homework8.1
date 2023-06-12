package org.example;

public interface Printable {
     abstract void print();

    static void printArrayOfPrintable(Printable[] printables) {
        for (var printable: printables) {
            printable.print();
        }
        System.out.println();
    }
}
