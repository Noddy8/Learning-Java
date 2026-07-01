// Write a program to print 1-10 skipping 7 and 8 using continue
public class _28TwentyEight {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7 || i == 8) {
                continue; // Skip 7 and 8
            }
            System.out.println(i);
        }
    }
}
