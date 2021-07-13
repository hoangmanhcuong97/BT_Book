public class ProgammingBook extends Book {
       private String language;
       private String framework;
       public ProgammingBook(){}

       public ProgammingBook(String language, String framework,String name, String bookCode, int price, String author){
           super(name, bookCode, price, author);
           this.language = language;
           this.framework = framework;
//           setName(name);
//           setBookCode(bookCode);
//           setPrice(price);
//           setAuthor(author);
       }

        public String getLanguage() {
            return language;
        }

        public String getFramework() {
            return framework;
        }

        public void setFramework(String framework) {
            this.framework = framework;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
}
