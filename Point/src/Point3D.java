public class Point3D extends Point2D {
    private float z =0.0f;

    public Point3D(){}

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float [] getXYZ(){
        float a[] = {this.z};
        return a;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z = z;
    }
    public String toString(){
        return getX() + " , " + getY() + " , " +z;
    }
}
