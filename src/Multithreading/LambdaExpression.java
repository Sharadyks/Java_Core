package Multithreading;

interface Student {
    public void getBio(String name);
}

class Test2 {
    public static void main(String[] args) {
        Student nameOfStudent = new Student() {
            @Override
            public void getBio(String name) {
                System.out.println(name+" is engineering student");
            }
        };
        Student medicalStudent = name -> System.out.println(name+" is a medical student");

    }
}