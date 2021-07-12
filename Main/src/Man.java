public class Man extends Main {
    public String tuoi;
    public Man(int age){
        super(age);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("tuoi:"+ this.tuoi);
    }
}
