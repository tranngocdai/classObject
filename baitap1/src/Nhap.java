import java.util.Scanner;

public class Nhap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        double a = scanner.nextDouble();
        System.out.println("Nhập b");
        double b = scanner.nextDouble();
        System.out.println("Nhập c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() >= 0){
                System.out.println( quadraticEquation.getRoot1()+"và"+quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println(quadraticEquation.getRoot1());
        }else {
            System.out.println("“The equation has no roots”");
        }

    }
}
