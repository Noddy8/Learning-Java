import java.util.*;
public class nineteen {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int num1 = S.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = S.nextInt();
        System.out.println("Enter 3rd Number");
        int num3 = S.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.println(num1 + " is the Greatest.");
        }
        else if (num2>num1 && num2>num3) {
            System.out.println(num2 + " is the Greatest.");
            
        }
        else if (num3>num1 && num3>num2) {
            System.out.println(num3 + " is the Greatest.");
            
        }
        else {
            System.out.println("Num entered is Zero or Equal");
        }
    }
    
}
