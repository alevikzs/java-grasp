package org.alevikzs.indirection.mistake.ex2;

class Student {
    private final int course;
    private final String name;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}
