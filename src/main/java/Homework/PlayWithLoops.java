package Homework;

public class PlayWithLoops {
    public static void main(String[] args) {

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println("Buy " + shoppingList[i]);
        }

        // Print numbers from 1 to 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Print all even numbers from 2 to 20

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // Calculate the sum of numbers fro 1 to 10

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);

        // Print elements from an array

        int[] numbers = {2, 20, 30, 40, 50, 55, 100};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

            // Print numbers in reverse order from 10 to 1

            for (int j = 10; j >= 1; j--) {
                System.out.println(j);
            }

            // Print multiplication table (5)

            int number = 5;
            for (int k = 1; k <= 10; k++) {
                int result = number * k;
                System.out.println(String.format("%d * %d = %d", number, k, result));
            }
        }
    }
}
