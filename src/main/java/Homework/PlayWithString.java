package Homework;

public class PlayWithString {

    public static void main(String[] args) {

        String name = "Ilja";
        String surName = "Racavic";

        // My name is: Ilja Racavic

        // Cancatenation

        String myText = "My name is: " + name + " " + surName;
        System.out.println(myText);

        System.out.println("My name is: " + name + " " + surName);

        // Interpolation
        // %s - for text
        // %d - for numeric values

        String interpolation = String.format("My name is: %s %s", name, surName);
        System.out.println(interpolation);

        String firstName = "Joe";
        String lastName = "Doe";
        String city = "New York";
        int age = 25;

        System.out.println(firstName + " " + lastName);

        // Example: Joe Doe is 25 ears old and lives in New York.

        System.out.println(firstName + " " + lastName + " is " + age + " years old and lives in " + city);
        System.out.println(String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, city));

    }
}