import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Nhap so luong cuon sach ban muon luu tru:");
        int n = sc.nextInt();
        //ham tao 1 cuon sach


        Book[] arr = createArrBook(n);

        sc.nextLine();
        System.out.println("Nhap ten cuon sach ban muon tim kiem: ");
        String name = sc.nextLine();
        int index = findNameBook(name, arr);
        System.out.println(toString(index, arr));

        sc.nextLine();
        System.out.println("Nhap gia cuon sach ban muon tim kiem: ");
        int priceBook = sc.nextInt();
        int viTri1 = findPrice(priceBook, arr);
        System.out.println(toString(viTri1, arr));

        sc.nextLine();
        System.out.println("Tinh tong gia cuon sach: " + calculateTotal(arr));

    }
    public static Book createBook (Book book, int position){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name book " + (position + 1) + " :");
        book.setName(sc.nextLine());
        System.out.println("Enter book code " + (position + 1) + " :");
        book.setBookCode(sc.nextLine());
        System.out.println("Enter name author book " + (position + 1) + " :");
        book.setAuthor(sc.nextLine());
        System.out.println("Enter price book " + (position + 1) + " :");
        book.setPrice(sc.nextInt());

        return book;
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

    public static int findNameBook(String name, Book[] arr){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())){
                index = i;
            }
        }
        return index;
    }

    public static int findBookCode(String bookCode, Book[] arr){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (bookCode.equals(arr[i].getBookCode())){
                index = i;
            }
        }
        return index;
    }

    public static int findPrice(int price, Book[] arr){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (price == arr[i].getPrice()){
                index = i;
            }
        }
        return index;
    }

    public static int calculateTotal(Book[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        return sum;
    }

    public static String toString(int index, Book[] arr){
        if(index < 0){
            return "No find";
        }
        return "Name: " + arr[index].getName() +
                "\nBookCode: " + arr[index].getBookCode() +
                "\nAuthor: " + arr[index].getAuthor() +
                "\nPrice: " + arr[index].getPrice() ;
    }
}
