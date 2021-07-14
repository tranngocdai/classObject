public class Cylinder extends Circle{
    private double height;

    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String name, String color, double radius, double height) {
        super(name, color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(double volume){
        return height*volume;
    }
}
