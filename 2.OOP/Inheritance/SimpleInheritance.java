public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("Simple Inheritance");
        Superclass obj1 = new Superclass();
        System.out.println("Value of num1 in superclass: " + obj1.num1);
        Subclass obj2 = new Subclass();
        System.out.println("Value of num1 in subclass: " + obj2.num1);
        System.out.println("Value of num2 in subclass: " + obj2.num2);
        System.out.println();
    }
    class superclass{
        int num1 = 10;
    }
    class subclass extends superclass{
        int num2 = 20;


    }
}