public class Hello {
    public int age;
    public String name;
    public float weight;
    public Hello(int age, String name, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void getInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.weight);
    }

}
