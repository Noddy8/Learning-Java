import java.util.*;
public class Thirteen {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("Enter a num For checking Divisibity:");
        int num= S.nextInt();
        String Result = (num%7==0) ? "Divisible by 7" : "Not-Divisible by 7";
        System.out.println(Result);
    }
}
