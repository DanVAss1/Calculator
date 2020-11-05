import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if(input.equals("+")){
            int sum = randomNumber + randomNumber;
            System.out.println(sum);
        }
        if(input.equals("-")){
            int sum = randomNumber - randomNumber;
            System.out.println(sum);
        }
        if(input.equals("*")){
            int sum = randomNumber * randomNumber;
            System.out.println(sum);
        }

    }
}
