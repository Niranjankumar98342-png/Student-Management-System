
public class StudentManagementSystem {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 85.5);

        Student s2 = new Student(102, "Amit", 90.0);

        System.out.println("===== Student Details =====");

        s1.displayStudent();

        System.out.println("---------------------------");

        s2.displayStudent();
    }
}
