import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double decimalNumber = input.nextDouble();

        int integerNumber = (int) decimalNumber;

        System.out.println("Original double value: " + decimalNumber);
        System.out.println("Converted int value: " + integerNumber);

        input.close();
    }
}