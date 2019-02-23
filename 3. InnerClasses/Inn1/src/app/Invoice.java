package app;

public class Invoice {
    public class Customer {
        public class Adress {
            private String adresline1;
            private String adresline2;

            public Adress(String a1, String a2) {
                this.adresline1 = a1;
                this.adresline2 = a2;
            }
            /**
             * @return the adresline1
             */
            public String getAdresline1() {
                return adresline1;
            }/**
             * @return the adresline2
             */
            public String getAdresline2() {
                return adresline2;
            }
        }
        private String name;
        public Customer(String name){
            this.name = name;
        }
        /**
         * @return the name
         */
        public String getName() {
            return name;
        }
    }
    private Integer invoiceNumber;
    public Invoice(int n) {
        this.invoiceNumber = n;
    }
    /**
     * @return the invoiceNumber
     */
    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }
}