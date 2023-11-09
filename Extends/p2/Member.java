package org.example.week9.p2;

public class Member {
    private int studentId;
    private String name;

    public Member(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + "\nName: " + name  + "\n";
    }
}
