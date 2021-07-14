public class Circle {
        private String name;
        private String color;
        private double radius = 1.0;

        public Circle(){

        }

        public Circle(String name, String color, double radius){
            this.name = name;
            this.color = color;
            this.radius = radius;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
            return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return " Name " + name
                + "Color"+ color
                + "Radius"+ radius
                + "Diện tích "+ getPerimeter();
    }
}
