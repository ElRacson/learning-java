package lv.acodemy;

public class Homework {
    public static void main(String[] args) {

// Exercise 1: program that checks if a given number is positive. If it is, print "Positive number."

        int x = 10;
        if (x >= 0) {
            System.out.println("x is positive number");
        }

        // Exercise 2: Java program that determines if a given integer is even. If it is, print "Even number."

        int z = 12;
        if (z % 2 == 0) {
            System.out.println("z is even number");
        }

        // Exercise 3: Age group classifier

        int age = 3;
        if (age >= 0 && age < 18) {
            System.out.println("Teenager");
        } else if (age >= 18) {
            System.out.println("Adult");
        }

        // Exercise 5: Java program that checks if a given number is positive, even, and less than 100. If all conditions are true, print "Valid number."

        int e = 60;
        if (e > 0 && e <= 100 && e % 2 == 0) {
            System.out.println("Valid number");
        }

        // Exercise 6: Create a Java program that checks if a number is positive, and if so, check if it's even. If both conditions are true, print "Positive and Even."

        int a = 20;
        if (a > 0 && a % 2 == 0) {
            System.out.printf("Number: %d is positive and even\n", a);
        }

        // Exercise 9: Write a Java program that calculates the final grade for a student based on their scores in three subjects:

        int[] grades = {95, 85, 78, 62, 52};

        for (int grade : grades) {
            if (grade >= 90) {
                System.out.printf("%d – a grade is of A \n", grade);
            } else if (grade >= 80 && grade < 90) {
                System.out.printf("%d – a grade is of B \n", grade);
            } else if (grade >= 70 && grade < 80) {
                System.out.printf("%d – a grade is of C \n", grade);
            } else if (grade >= 60 && grade < 70) {
                System.out.printf("%d – a grade is of D \n", grade);
            } else if (grade <= 60) {
                System.out.printf("%d – a grade is of F \n", grade);
            }

        }

        // Exercise 10: File extension checker

        String file = "filename.exe";
        if (file.endsWith(".txt") || file.endsWith(".doc") || file.endsWith(".pdf")) {
            System.out.println("Valid file extension");
        } else {
            System.out.println("Invalid file extension");

        }

    }
}
