public class RunRectangle {
    public static void main(String[] args) {
        Reactangle reactangle = new Reactangle();
        System.out.println(reactangle);

        reactangle = new Reactangle(3,4);
        System.out.println(reactangle);

        reactangle = new Reactangle("red",true,3,4);
        System.out.println(reactangle);
    }
}
