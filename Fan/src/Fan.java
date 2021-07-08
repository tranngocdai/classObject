public class Fan {
    public final int SLOW =1;
    public final int MEDIUM =2;
    public final int FAST =3;
    private int speed=SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){
    }
    public String toString() {
        if(on){
            return " Speed:" + speed + ", radius:" + radius + ",color:"+color +", Fan is on";
        }else{
            return " Speed:" + speed +" radius:" + radius + ",color:"+color +"Fan is off";
        }
    }
}
