package herencia;
class SuperClass {
    public void display() {
        System.out.println("SuperClass");
    }
}

class SubClass extends SuperClass {
    public void display() {
        System.out.println("SubClass");
    }
}
class Parent {
    public void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Child display");
    }
}


public class TestChatG {
	public static void main(String[] args) {
        //SuperClass obj = new SubClass();
        //obj.display();
        Parent obj = new Child();
        obj.display();
    }

}
