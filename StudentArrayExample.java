class Student {
    public int rollNo;
    public String name;
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }}
public class StudentArrayExample {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student(1, "Vaibhav");
        System.out.println(arr[0].name);
    }}

