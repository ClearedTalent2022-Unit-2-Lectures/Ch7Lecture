package org.launchcode;

public class Main {
    public static void main(String[] args) {
        Instructor pearce = new Instructor(1,"Pearce", "Odegard", false);
        System.out.println(pearce.getFirstName());
        System.out.println(pearce.getLastName());
        System.out.println(pearce.isCleared());
        System.out.println(pearce.getCohortsLed());

        Student yeseul = new Student("Steve", "Yeseul", "Park", true);
        System.out.println(yeseul.getFirstName());
        System.out.println(yeseul.getLastName());
        System.out.println(yeseul.isCleared());
        System.out.println(yeseul.getTA());

        // So now we have an Instructor Object AND a Student object
        // Let's create just a regular Person object
        // The problem is, we have made the Person abstract. The Person is abstract because it is purely
        // a parent class that is used to organize our various different types of people in this application.
//        Person johnCena = new Person("John", "Cena", false);
        Person dusty = new Student("Amanda", "Dusty", "Alowan", true);

    }
}
