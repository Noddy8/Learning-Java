public class Six {
    public static void main(String[] args) {
        String a= "aa";
        String b= "bb";
        String c;
        System.out.println("Before:");
        System.out.println("a="+ a + " " + "b="+b);
        c=a;
        a=b;
        System.out.println("After:");
        System.out.println("a="+a);
        b=c;
        System.out.println("b="+b);
    }
}
