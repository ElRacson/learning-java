package classroom;

public class PlayWithForLoops {

    public static void main(String[] args) {

        // Print number from 1 to 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);

        // Print elements from an array

        int[] numbers = {2, 20, 30, 40, 50, 55, 100};
        for (int number : numbers) ;
        {
            System.out.println(numbers);
        }

        // Print numbers in reverse order from 10 to 1

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);

            // Print multiplication Table (5)

            int number = 5;
            for (int i = 1; i <= 10; i++) {

                int result = number * i;

            }


        }
    }
}
