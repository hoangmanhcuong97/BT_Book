import java.util.Scanner;

public class Book {
    private String bookCode;
    private String name;
    private int price;
    private String author;

    public Book(){
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

    public void setName() {}
    public void setPrice() {}
    public void setAuthor() {}
    public void setBookCode() {}


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong cuon sach ban muon luu tru:");
        int n = sc.nextInt();
        Book[] arr = createArrBook(n);

        sc.nextLine();
        System.out.println("Nhap ten cuon sach ban muon tim kiem: ");
        String name = sc.nextLine();
        int index = findNameBook(name, arr);
        System.out.println(toString(index,arr));

        sc.nextLine();
        System.out.println("Nhap bookCode cuon sach ban muon tim kiem: ");
        String maCode = sc.nextLine();
        int viTri = findBookCode(maCode, arr);
        System.out.println(toString(viTri,arr));

        sc.nextLine();
        System.out.println("Nhap gia cuon sach ban muon tim kiem: ");
        int priceBook = sc.nextInt();
        int viTri1 = findPrice(priceBook, arr);
        System.out.println(toString(viTri1,arr));

        sc.nextLine();
        System.out.println("Tinh tong gia cuon sach: " + calculateTotal(arr));



    }
    //ham tao 1 cuon sach
    public static Book createBook(Book book1, int position){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name book " + (position + 1) + " :");
        book1.name = sc.nextLine();
        System.out.println("Enter book code " + (position + 1) + " :");
        book1.bookCode = sc.nextLine();
        System.out.println("Enter name author book " + (position + 1) + " :");
        book1.author = sc.nextLine();
        System.out.println("Enter price book " + (position + 1) + " :");
        book1.price = sc.nextInt();

        return book1;
    }
    //ham tao mang cac cuon sach
    public static Book[] createArrBook(int n){
        Book[] arr= new Book[n];
        int i = 0;
        while(i < n){
            Book book = new Book();
            arr[i] = createBook(book, i);
            i++;
        }
        return arr;
    }

    private static int findNameBook(String name, Book[] arr){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].name)){
                index = i;
            }
        }
        return index;
    }

    private static int findBookCode(String bookCode, Book[] arr){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (bookCode.equals(arr[i].bookCode)){
                index = i;
            }
        }
        return index;
    }

    private  static  int findPrice(int price, Book[] arr){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (price == arr[i].price){
                index = i;
            }
        }
        return index;
    }

    private static int calculateTotal(Book[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].price;
        }
        return sum;
    }
    public static String toString(int index, Book[] arr){
        if(index < 0){
            return "No find";
        }
        return "Name: " + arr[index].name +
               "\nBookCode: " + arr[index].bookCode +
                "\nAuthor: " + arr[index].author +
                "\nPrice: " + arr[index].price ;
    }
}
