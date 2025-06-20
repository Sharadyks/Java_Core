package Classes_and_Objects;

public class Course {
    static int maxcapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;
    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxcapacity];
    }

    static void setMaxcapacity(int maxcapacity){
        Course.maxcapacity = maxcapacity;
    }
    void enrolledStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }
}
