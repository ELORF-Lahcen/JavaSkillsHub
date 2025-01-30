package object_oriented.java_constructor.chaining_constructors;

public class Student {

    private int studentId;
    private String studentName;
    private String grade;

    public Student() {
        this(0, "Unknown", "Unknown");
    }

    public Student(int studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student(1, "Lahcen", "Primary");

        System.out.println("Student1's ID : " + std1.getStudentId() + "\nStudent1's name : " + std1.getStudentName() + "\nStudent1's grade : " + std1.getGrade());
        System.out.println();
        System.out.println("Student2's ID : " + std2.getStudentId() + "\nStudent2's name : " + std2.getStudentName() + "\nStudent2's grade : " + std2.getGrade());
    }
}
