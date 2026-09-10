package Pacakege;
class Parent {

    private int i;

    void getI(int i) {
        this.i = i;
    }

    void putI() {
        System.out.println("I := " + i);
    }
}

class Child extends Parent {

    int j;

    void getJ(int j) {
        this.j = j;
    }

    void display() {
        // System.out.println("I := " + i); 
        putI();                             
        System.out.println("J := " + j);
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Parent p = new Parent();

        p.getI(30);
        p.putI();

        Child child = new Child();

        child.getI(10);
        child.getJ(20);
        child.display();
    }
}