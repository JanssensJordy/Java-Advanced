package app;

public class Library {
    public static class Cabinet{
        public static class Shelf{
            public  static class Book{
                private static int id = 1;

                public Book(){
                    id++;
                }
                /**
                 * @return the id
                 */
                public int getId() {
                    return id;
                }
                public String getFullId(){
                    return Library.Cabinet.Shelf.Book.this.getId() + "." + Cabinet.Shelf.Book.this.getId() + "." + Shelf.Book.this.getId() + "." + this.getId();
                }
            }
            private static int id = 1;

            public Shelf(){
                id++;
            }
            /**
             * @return the id
             */
            public int getId() {
                return id;
            }
        }
        private static int id = 1;

        public Cabinet(){
            id ++;
        }
        /**
         * @return the id
         */
        public int getId() {
            return id;
        }
    }
    private String id;

    public Library(String id) {
        this.id = id;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
}