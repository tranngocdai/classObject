import java.util.Scanner;

public class nhapRetangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        int width = scanner.nextInt();
        System.out.println("Nhập chiều dài");
        int height = scanner.nextInt();
        Retangle retangle = new Retangle(width, height);
        System.out.println("Chu vi là: " + retangle.getPerimeter());
        System.out.println("Diện tích là: " + retangle.getArea());
        System.out.println("Chiều rộng: " + retangle.getWidth());
        System.out.println("Chiều dài: " + retangle.getHeight());
    }
}
