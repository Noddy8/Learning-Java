// Write a program to print 1-5 only using break. (Loop goes from 1 – 10).
public class _29TwentyNine {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i > 5) {
                break; // Exit the loop when i is greater than 5
            }
            System.out.println(i);
        }
    }
}
