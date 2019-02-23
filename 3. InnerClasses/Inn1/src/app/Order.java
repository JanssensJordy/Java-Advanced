package app;

import java.util.ArrayList;

import app.Invoice.Customer;
import app.Invoice.Customer.Adress;
import app.ProductClass.Product;

public class Order {
    private Invoice invoice;
    private Customer customer;
    private Adress adress;
    private ArrayList<Product> products;

    public Order(Invoice invoice, Customer customer, Adress adress) {
        this.invoice = invoice;
        this.customer = customer;
        this.adress = adress;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p){
        this.products.add(p);
    }

    @Override
    public String toString(){
        String order = "Invoice No " + this.invoice.getInvoiceNumber() + "\n" + this.customer.getName() + "\n" + this.adress.getAdresline1() + "\n" + this.adress.getAdresline2() + "\n \n";
        double total = 0;
        for (int i = 0; i < this.products.size(); i++) {
            order += this.products.get(i).getName() + "\t" + this.products.get(i).getQuantity() + "\t" + this.products.get(i).getPrice() + "\n";
            total += this.products.get(i).getPrice();
        }
        order += "\n \t\t\tTotal:  " + total;

        return order;
    }

}