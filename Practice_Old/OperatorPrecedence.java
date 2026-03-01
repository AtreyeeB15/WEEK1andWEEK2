import java.util.Scanner;

public class OperatorPrecedence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        System.out.print("Enter value of d: ");
        double d = input.nextDouble();

        System.out.print("Enter value of e: ");
        double e = input.nextDouble();

        double result = a + b * c - d / e;

        System.out.println("Result: " + result);

        input.close();
    }
}