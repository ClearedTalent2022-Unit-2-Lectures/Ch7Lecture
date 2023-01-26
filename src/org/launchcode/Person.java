package org.launchcode;

public class Person {
    // firstName, lastName, hasClearance
    private String firstName;
    private String lastName;
    private boolean cleared;

    public Person(String firstName, String lastName, boolean hasClearance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cleared = hasClearance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isCleared() {
        return cleared;
    }

    public void setCleared(boolean cleared) {
        this.cleared = cleared;
    }
}
