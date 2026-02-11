abstract class Sample {

    abstract void show();

    int a = 10;

    void display() {
        System.out.println(a);
    }
}

class Child extends Sample {

    void show1() {
        System.out.println("This is show1 method.");
    }

    @Override
    void show() {
        System.out.println("This is the implementation of the abstract method show() in the child class.");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Child c = new Child();

        c.display();
        c.show1();
        c.show();
    }
}
