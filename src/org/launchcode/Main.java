package org.launchcode;

public class Main {

    public static void main(String[] args) {
        Instructor pearce = new Instructor(1,"Pearce", "Odegard", false);
        System.out.println(pearce.getFirstName());
        System.out.println(pearce.getLastName());
        System.out.println(pearce.isCleared());
        System.out.println(pearce.getCohortsLed());
    }
}
