package constructor;

public class Winding {
    void add(int a,int b){
        System.out.println("int value is "+(a+b));
    }

    void add(float a,float b){
        System.out.println("float value"+(a+b));
    }

    void add(char a,char b){
        System.out.println("char value is"+(a+b));
    }
    
    void add(double a, double b){
        System.out.println("double int is"+(a+b));
    }


    public static void main(String[] args) {
        Winding obj=new Winding();
        obj.add(15,15 );
        obj.add(1.8f, 1.5f);
        obj.add('c','k');
        obj.add(3.5d, 6.5d);

    }
}
