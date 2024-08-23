import java.util.*;
public class Sixteen {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a Number between 1-7:");
        int Day = S.nextInt();
        if (Day==1) {
            System.out.println("Today is Sunday");
        }
        else if (Day==2) {
            System.out.println("Today is Monday");            
        }
        else if (Day==3) {
            System.out.println("Today is Tuesday");            
        }
        else if (Day==4) {
            System.out.println("Today is Wednesday");            
        }
        else if (Day==5) {
            System.out.println("Today is Thusday");            
        }
        else if (Day==6) {
            System.out.println("Today is Friday");            
        }
        else if (Day==7) {
            System.out.println("Today is Saturday");            
        }
        else{
            System.out.println("Entered Number is not between 1-7.Please enter a vaild number");
        }
    }
}
