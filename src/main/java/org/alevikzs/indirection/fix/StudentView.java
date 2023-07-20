package org.alevikzs.indirection.fix;

class StudentView implements View<StudentModel> {

    public void print(StudentModel student) {
        System.out.println("Student: ");
        System.out.println("Name: " + student.getName());
        System.out.println("Course: " + student.getCourse());
    }

}
