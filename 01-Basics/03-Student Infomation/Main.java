class StudentInfo {
    String name;
    int age;
    String course;
    int studentID;

    StudentInfo(String name, int age, String course, int studentID) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.studentID = studentID;
    }

    void displayInfo() {
        System.out.println("Student Information");
        System.out.println("-------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + studentID);
    }
}

public class Main {
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo("John Doe", 18, "Computer Science", 1001);
        student1.displayInfo();
    }
}