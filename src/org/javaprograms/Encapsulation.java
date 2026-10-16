package org.javaprograms;

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rahul");
        s.setMarks(85);
        System.out.println(s.getName() + " scored " + s.getMarks());
        s.setMarks(150);
        System.out.println(s.getName() + " still has " + s.getMarks());
    }
}

// Encapsulation: fields are private, access is through getters and setters.

class Student {
    private String name;
    private int marks;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks: " + marks + " (must be 0 to 100)");
        } else {
            this.marks = marks;
        }
    }
}
