package app;

/**
 * ProductClass
 */
public class ProductClass {
    public class Product {
        private String name;
        private int quantity;
        private Double price;
        public Product(String name, int quantity, Double price){
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
        /**
         * @return the name
         */
        public String getName() {
            return name;
        }/**
         * @return the quantity
         */
        public int getQuantity() {
            return quantity;
        }/**
         * @return the price
         */
        public Double getPrice() {
            return price*this.quantity;
        }
    }
    private String name;
    public ProductClass(String name) {
        this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}