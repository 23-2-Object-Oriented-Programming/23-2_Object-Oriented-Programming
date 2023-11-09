package org.example.week9.p2;

public class Crew extends Member{
    private String department;

    public Crew(int studentId, String name, String department) {
        super(studentId, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + "Department: " + this.department + "\n";
    }
}
