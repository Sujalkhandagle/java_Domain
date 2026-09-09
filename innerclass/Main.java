package innerclass;
class Outerclass{
    static int data=20;
    void display(){
        Innerclass obj=new Innerclass();
        obj.show();
    }
    static class Innerclass{
        int sample=100;
       static  void show(){
            // System.out.println("sample := "+sample);
            System.out.println("data := "+data);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Outerclass.Innerclass inner=new Outerclass().new Innerclass();
        // // inner.show();
        // Outerclass obj1=new Outerclass();
        // obj1.display();
        Outerclass.Innerclass.show();
    }
    
}
