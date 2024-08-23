import java.util.*;
public class Eighteen {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = S.nextInt();
        if (year%4==0 || year%100!=0 && year%400==0){
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year +" is not a Leap Year");
        }
    }
}
