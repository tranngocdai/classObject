public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(11,"N");
        Student s2 = new Student(22,"M");
        Student s3 = new Student(33,"H");

        s1.display();
        s2.display();
        s3.display();
    }
}
