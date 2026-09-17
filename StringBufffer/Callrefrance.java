class Temp{
    int a;
    void swap(Temp t1,Temp t2){
        Temp t=new Temp();
        t.a=t1.a;
        t1.a=t2.a;
        t2.a=t.a;
    }
}
public class Callrefrance {
    public static void main(String[] args) {

        Temp t1=new Temp();
        t1.a=45;
        Temp t2=new Temp();
        t2.a=57;
        Temp t=new Temp();
        t.swap(t1, t2);
        System.out.println(t1.a+" "+t2.a);
        
    }
}
