package Static;

class Ohh{
    int data;
    static int count;
    Ohh(){}
    Ohh(int data){
        this.data=data;
        count++;
    }

    void display(){
        System.out.println("data :="+data+"count := "+count);
    }


        //static method call using only static member varibale

    static void show(){
  
        System.out.println("count := "+count);
    }

}

public class Code {
    static void get(){
        System.out.println("static");
    }
    public static void main(String[] args) {
        get();

        Ohh s1=new Ohh(100);
        Ohh s2=new Ohh(200);
        Ohh.show();
        Ohh s3=new Ohh(300);
        Ohh s4=new Ohh(400);

        //static method call
        Ohh.show();

        s1.display();
        s2.display();
        s3.display();
        s4.display();


        
    }
}
