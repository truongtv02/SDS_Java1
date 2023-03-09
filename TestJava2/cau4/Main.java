package TestJava2.cau4;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer("John", 19, "NY");
        developer1.DisplayInfor();
        ;

        developer1.setAge(20);
        developer1.DisplayInfor();
    }
}