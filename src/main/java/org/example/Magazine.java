package org.example;

public class Magazine extends Publication implements Printable {


    public Magazine(String name) {
        super(name);
    }

    public static void printMagazines(Printable[] printable) {
        for (var p : printable) {
            if (p instanceof Magazine magazine) {
                System.out.println("Magazine: " + magazine.getName());
            }
        }
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("Magazine \"" + this.getName() + "\" is printed");
    }
}
