package Challenges;

public class StudentToString {
    String name;
    int age;
    String background;

    StudentToString(String name, int age, String background){
        this.name = name;
        this.age = age;
        this.background = background;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", background='" + background + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StudentToString student1 = new StudentToString("Sharad Sharma",19, "Engineering");
        System.out.println(student1.toString());
    }
}
