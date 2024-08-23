import java.util.*;
public class Fifteen {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        if (num==0)
        System.out.println("It is 0");
        else if(num<0)
        System.out.println("Number is -ve");
        else
        System.out.println("Number is +ve");

    }
}
