import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to the calculator");
        System.out.println("What would you like your first number to be?");

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        System.out.println("what would you like to do + , - , * ?");

        String opp = scanner.next();
        System.out.println("With what other number?");

        int second = scanner.nextInt();

        if(opp.equals("+")){
            int sum = first + second;
            System.out.println(sum);
        }
        if(opp.equals("-")){
            int sum = first - second;
            System.out.println(sum);
        }
        if(opp.equals("*")){
            int sum = first * second;
            System.out.println(sum);
        }
    }
    }



