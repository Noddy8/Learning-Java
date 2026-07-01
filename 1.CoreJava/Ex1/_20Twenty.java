//Write a program to find greatest and least of 3 numbers.
import java.util.*;
public class _20Twenty {
    public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    
    System.out.println("Enter 1st number");
    int num1 = S.nextInt();
    System.out.println("Enter 2nd number");
    int num2 = S.nextInt();
    System.out.println("Enter 3rd number");
    int num3 = S.nextInt();

    if (num1>num2 && num1>num3){
            System.out.println(num1+" is greatest");
        }else if (num1<num2 && num2>num3){
            System.out.println(num2+" is greatest");
        }else if (num3>num1 && num3>num2){
            System.out.println(num3+" is greatest");
        }else{
            System.out.println("All are equal");
        }
    
}    
}
