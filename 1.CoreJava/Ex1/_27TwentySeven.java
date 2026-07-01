// Write a program to calculate Simple Interest for all the rate of interest between 1% - 10%.
public class _27TwentySeven {
    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double time = 1; // Time in years

        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time + " year(s)");
        System.out.println("Rate of Interest\tSimple Interest");

        for (int rate = 1; rate <= 10; rate++) {
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println(rate + "%\t\t\t" + simpleInterest);
        }
    }
}
