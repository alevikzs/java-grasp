package org.alevikzs.indirection.mistake.ex1;

public class Main {

    public static void main(String[] args) {
        var student = new Student("Bill", 2);
        var view = new StudentView(student);
        view.print();
    }

}