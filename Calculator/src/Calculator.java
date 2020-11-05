import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator");
        System.out.println("Your two random numbers are");

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        int first = random.nextInt(100);
        int second = random.nextInt(100);

        System.out.println(first);
        System.out.println(second);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if(input.equals("+")){
            int sum = first + second;
            System.out.println(sum);
        }
        if(input.equals("-")){
            int sum = first - second;
            System.out.println(sum);
        }
        if(input.equals("*")){
            int sum = first * second;
            System.out.println(sum);
        }

    }
}
