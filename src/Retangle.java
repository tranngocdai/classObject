public class Retangle {
    private int width, height;

    public Retangle() {

    }
    public Retangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setWidth() {
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea() {
        return this.width * this.height;
    }
    public int getPerimeter() {
        return (this.width + this.height)*2;
    }
}
