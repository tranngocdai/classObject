import java.util.Scanner;
public class RunBook{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập");
        int number = scanner.nextInt();
        Book [] arr = Book.arrBook(number);
        scanner.nextLine();
        String name = scanner.nextLine();
        int index = Book.searchNameBook(name,arr);
        Double price =scanner.nextDouble();
        int index = searchPriceBook(price,arr);
    }
}

