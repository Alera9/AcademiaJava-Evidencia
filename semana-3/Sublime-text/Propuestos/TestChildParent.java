class Parent {
    void display(int num) {
        System.out.println("Parent: " + num);
    }
    void display(String msg) {
        System.out.println("Parent: " + msg);
    }
}
class Child extends Parent {
    void display(int num) {
        System.out.println("Child: " + num);
    }
}
public class TestChildParent {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display(5);
        obj.display("Hello");
    }
}
