import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopwatch = new StopWatch();
        System.out.println("nhấn phím bất kì nhập: ");
        scanner.nextInt();
        System.out.println("time start: " + stopwatch.start());
        System.out.println("nhấn phím bất kì để stop");
        scanner.nextInt();
        System.out.println("EndTime : " + stopwatch.stop());
        System.out.println("ElapsedTime: " + stopwatch.getElapsedTime());



    }
}
