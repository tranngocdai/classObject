import java.util.Scanner;

public class Book {
     public String name;
     public double price;
     public String author;
     public int bookCode;

     public Book(){

     }

    public double getPrice() {
        return price;
    }

    public int getBookCode() {
        return bookCode;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public static Book newBook(Book book){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã sách");
        book.setBookCode(scanner.nextInt());
        System.out.println("nhập giá sách");
        book.setPrice(scanner.nextDouble());
        System.out.println("nhập tên sách");
        book.setName(scanner.nextLine());
        System.out.println("tên tác giả");
        book.setAuthor(scanner.nextLine());

    }
    public static Book[] arrBook(int n){
        Book []arr = new Book[n];
        for(int i = 0; i < n; i++){
            Book book = new Book();
            arr[i] = newBook(book);
        }
        return arr;
    }

    public static int searchNameBook(String name, Book[]arr){
        int index =-1;
        for (int i = 0; i < arr.length; i++){
            if(name.equals(arr[i].name)){
                index = i;
            }
        }
        return index;
    }

    public String searchPriceBook(Book[]arr, int price){
        int index = -1;
        for(int i = 0; i < arr.length;i++){
            if(index==arr[i].price){
                index =i ;
            }
        }return index;
    }

}
