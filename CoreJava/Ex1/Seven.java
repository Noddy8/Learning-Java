public class Seven {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println("a="+a); //Out 1
        System.out.println("b="+b); //Out 2
        
        // Add,Sub
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a); //Out 2
        System.out.println("b="+b); //Out 1
        
        // One Line
        a = (a*b)/(b=a);
        System.out.println("a="+a); //Out 1
        System.out.println("b="+b); //Out 2
        
        // BitWise XOR
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a); //Out 2
        System.out.println("b="+b); //Out 1
        
    }
}
