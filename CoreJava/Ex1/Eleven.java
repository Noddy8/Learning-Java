public class Eleven {
    boolean booValue;
    int intValue;
    byte byteValue;
    short shortValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    String StringValue;
    Object objValue;

    public void test(){
        System.out.println(booValue);
        System.out.println(intValue);
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(StringValue);
        System.out.println(objValue);
    } 
    public static void main(String[] args) {
        Eleven test = new Eleven();
        test.test();

    }
}
