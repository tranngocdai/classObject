public class Reactangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Reactangle(){

    }

    public Reactangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Reactangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "
                + getWidth()
                + " and "
                + getLength()
                + "which is a subclass of "
                + super.toString();

    }
}
