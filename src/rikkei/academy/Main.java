package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1= new Student(111,"Thầy Chính");
        Student s2= new Student(222,"Hà");
        Student s3= new Student(333, "Hân");

        s1.display();
        s2.display();
        s3.display();
    }
}