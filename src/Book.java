import java.util.Scanner;

public class Book {
    private String bookCode;
    private String name;
    private int price;
    private String author;

    public Book(){
    }
    public Book(String name, String bookCode, int price, String author){
        this.name = name;
        this.bookCode = bookCode;
        this.price = price;
        this.author = author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) { this.name = name;}
    public void setPrice(int price) {this.price = price;}
    public void setAuthor(String author) {this.author = author;}
    public void setBookCode(String bookCode) {this.bookCode = bookCode;}


}
