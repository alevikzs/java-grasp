package org.alevikzs.indirection.mistake.ex2;

class StudentView {

    private final Student student;

    public StudentView(Student student) {
        this.student = student;
    }

    public void print() {
        System.out.println("Student: ");
        System.out.println("Name: " + student.getName());
        System.out.println("Course: " + student.getCourse());
    }

    public void printPerson() {
        System.out.println("Person: ");
        System.out.println("Name: " + student.getName());
    }

}
