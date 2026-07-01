// Write a program to calculate sum of n natural numbers.
import java.util.Scanner;
public class _24TwentyFour {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = S.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
