//Write your name on screen 10 times.
import java.util.*;
public class _21TwentyOne {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = S.nextLine();
        for (int i=1; i<=10; i++){
            System.out.println(name);
        }

    }
}
