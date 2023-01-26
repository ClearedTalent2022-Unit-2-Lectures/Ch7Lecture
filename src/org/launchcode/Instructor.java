package org.launchcode;

public class Instructor extends Person {
    // This class is a child class (or subclass) of the
    // Person class. Therefore, it will inherit any fields
    // and methods defined in the Person class.

    private int cohortsLed;

    public Instructor(int cohortsLed, String firstName, String lastName, boolean hasClearance) {
        super(firstName, lastName, hasClearance);
        this.cohortsLed = cohortsLed;
    }

    public int getCohortsLed() {
        return cohortsLed;
    }

    public void setCohortsLed(int cohortsLed) {
        this.cohortsLed = cohortsLed;
    }
}
