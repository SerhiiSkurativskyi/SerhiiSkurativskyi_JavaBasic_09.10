import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Guess a number from 0 to 10 inclusive in maximum 3 attempts.");
        int min = 0;
        int max = 10;
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Hidden number: " + randomInt);/*строка для сверки корректности работы программы*/

        int maxAttempts = 3;

        for (int i = 1; i < (maxAttempts + 1); i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = in.nextInt();
            System.out.printf("Your number: %d \n", num);

            if (randomInt != num && maxAttempts!=i) {
                System.out.println("Unfortunately you didn't guess. Try again!");
            }
            if (randomInt == num) {
                System.out.println("Congratulation! You guessed!");
                i = maxAttempts + 1;

                in.close();
            }
            if (i == (maxAttempts)) {
                System.out.println("You didn't guess! Hidden number was: " + randomInt);
            }
        }
    }
}

