package org.launchcode;

public class Student extends Person {
    private String TA;

    public Student(String TA, String firstName, String lastName, boolean hasClearance) {
        super(firstName, lastName, hasClearance);
        this.TA = TA;
    }

    public String getTA() {
        return TA;
    }

    public void setTA(String TA) {
        this.TA = TA;
    }
}
