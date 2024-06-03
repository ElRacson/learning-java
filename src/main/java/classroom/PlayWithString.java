package classroom;

public class PlayWithString {
    public static void main(String[] args) {

        String name = "Ilja";
        String lastName = "Racavic";

        // My name is Ilja Racavic


        // Concatenation
        String myText = "My name is: " + name + " " + lastName;
        System.out.println(myText);

        System.out.println("My name is: " + name + " " + lastName);

        // Interpolation
        String interpolation = String.format("My name is: %s %s", name, lastName);
        System.out.println(interpolation);

        // Task #1
        String firstName = "John";
        String surName = "Doe";
        int age = 25;
        String city = "New York";

        System.out.println(firstName + " " + surName);
        System.out.println(firstName + " " + surName + " is " + age + " years old and lives in " + city);
        System.out.printf("Using Interpolation: %s %s is %d years old and lives in %s\n", firstName, surName, age, city);


    }
}
