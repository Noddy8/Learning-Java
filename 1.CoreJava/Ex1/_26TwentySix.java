// Write a program to calculate the factorial of a number.
import java.util.Scanner;
public class _26TwentySix {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = S.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
