public class Multilevel {
    public static void main(String[] args) {
        System.out.println("Multilevel Inheritance");
        Subclass subclass = new Subclass();
        System.out.println("Value of num1 in grandparent: " + subclass.num1);
        System.out.println("Value of num2 in parent: " + subclass.num2);
        System.out.println("Value of num3 in subclass: " + subclass.num3);
    }
}
class Grandparent {
    int num1 = 10;
}
class Parent extends Grandparent {
    int num2 = 20;
}
class Subclass extends Parent {
    int num3 = 30;
}
