public class Simple {
    public static void main(String[] args) {
        System.out.println("Simple Inheritance");
        Subclass subclass = new Subclass();

        System.out.println("Value of num1 in superclass: " + subclass.num1);
        System.out.println("Value of num2 in subclass: " + subclass.num2);
    }
}
class Superclass {
        int num1 = 10;
}
class Subclass extends Superclass {
        int num2 = 20;
    }
    
