package app;

import app.Invoice.Customer;
import app.Invoice.Customer.Adress;
import app.ProductClass.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Invoice i1 = new Invoice(1);
        Customer jef = i1.new Customer("Jef Janssens");
        Adress ja = jef.new Adress("Vredebaan 57", "2640 Mortsel");
        ProductClass vlees = new ProductClass("Vleesproducten");
        Product brw = vlees.new Product("BoerenRingWorst", 200, 0.021);
        Product ssw = vlees.new Product("SamsonWorst", 100, 0.031);
        Product pita = vlees.new Product("PitaVlees", 800, 0.21);
        Product gehakt = vlees.new Product("GehaktVlees", 500, 0.10);
        Product rw = vlees.new Product("RingWorst", 200, 0.41);

        Order o1 = new Order(i1, jef, ja);
        o1.addProduct(brw);
        o1.addProduct(ssw);
        o1.addProduct(pita);
        o1.addProduct(gehakt);
        o1.addProduct(rw);

        System.out.println(o1);
    }
}