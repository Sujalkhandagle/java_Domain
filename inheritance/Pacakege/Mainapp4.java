package Pacakege;
abstract class Shape{
    abstract void area();
}

class Circle extends Shape{
    void area(){
        double radius=4.6;
        double a=3.14*radius*radius;
        System.out.println("circle raddius :="+a);
        
    }
}

class Rectangle extends Shape{
    void area(){
        
        int len,bre;
        len=7;
        bre=4;
        int a=len*bre;
        System.out.println("reacatngle area :="+a);
        
    }
}

class Square extends Shape{
    void area(){
       
        int len=5;
        int hig=5;
        int a=len*hig;
        System.out.println("sqare area :"+a);
        
    }
}

public class Mainapp4 {
    public static void main(String[] args) {
        Shape shape;
        shape=new Circle();
        shape.area();

        shape=new Rectangle();
        shape.area();
        shape=new Square();
        shape.area();
        
    }
}
