package app;

import app.Library.Cabinet;
import app.Library.Cabinet.Shelf;
import app.Library.Cabinet.Shelf.Book;

public class App {
    public static void main(String[] args) throws Exception {
        Library mortsel = new Library("BibliotheekMortsel");

        Library.Cabinet a = new Library.Cabinet(); 
        Cabinet b = mortsel.new Cabinet();
        Cabinet c = mortsel.new Cabinet();
        Cabinet d = mortsel.new Cabinet();
        Cabinet e = mortsel.new Cabinet(); 

        Shelf a1 = a.new Shelf();
        Shelf a2 = a.new Shelf();
        Shelf a3 = a.new Shelf();
        Shelf b1 = b.new Shelf();
        Shelf b2 = b.new Shelf();
        Shelf b3 = b.new Shelf();
        Shelf c1 = c.new Shelf();
        Shelf c2 = c.new Shelf();
        Shelf c3 = c.new Shelf();
        Shelf c4 = c.new Shelf();
        Shelf c5 = c.new Shelf();
        Shelf c6 = c.new Shelf();

        Book a11 = a1.new Book();
        Book a12 = a1.new Book();
        Book a13 = a1.new Book();
        Book c51 = c5.new Book();
        Book c52 = c5.new Book();
        Book c53 = c5.new Book();
        Book c54 = c5.new Book();
        Book c55 = c5.new Book();
        Book c56 = c5.new Book();
        Book c57 = c5.new Book();
        Book c58 = c5.new Book();
        Book c59 = c5.new Book();
        Book c510 = c5.new Book();
        Book c511 = c5.new Book();

        System.out.println(c511.getFullId());
    }
}