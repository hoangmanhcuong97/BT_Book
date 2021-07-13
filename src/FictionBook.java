public class FictionBook extends Book{
        private String category;

        public FictionBook(){}

        public FictionBook(String category,String name, String bookCode, int price, String author){
            this.category = category;
            setName(name);
            setBookCode(bookCode);
            setPrice(price);
            setAuthor(author);
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getCategory() {
            return category;
        }
}

