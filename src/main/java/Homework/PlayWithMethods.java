package Homework;

public class PlayWithMethods {
    public static void main(String[] args) {

        // Void method
        greeting("Ilja");

        // Method that print something
        var x = add(10, 20);
        System.out.println(x);
        System.out.println(add(30, 40));

        // Check if number is even
        System.out.println(isEven(10));
        System.out.println(isEven(11));
        System.out.println(isEven(500));
        System.out.println(isEven(13));

        // Find max number out of two numbers
        System.out.println(findMax(40, 30));
        System.out.println(findMax(20, 10));
        System.out.println(findMax(0, 1));

        // Check if word is palindrome
        System.out.println(isPalindrome("kajak"));
        System.out.println(isPalindrome("acodemy"));

    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int firstnumber, int secondnumber) {
        return firstnumber + secondnumber;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int findMax(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            return numberOne;
        } else {
            return numberTwo;
        }
    }

    // Palindrome (kajak, civic, rotator, tenet, repaper, madam)
    public static boolean isPalindrome(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return word.equals(reversedWord);

    }
}

