import java.util.*;
public class Fourteen {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n = S.nextInt();
        if(n==0) System.out.println("Zero");
        else if (n%2==0) System.out.println("Even");  
        else
        System.out.println("Odd"); 
    }
}
