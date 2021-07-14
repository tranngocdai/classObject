public class RunSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4,"red",true);
        System.out.println(square);
    }
}
