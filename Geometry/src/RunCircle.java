public class RunCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(4);
        System.out.println(circle);

        circle = new Circle("red", false, 4);
        System.out.println(circle);


    }
}
