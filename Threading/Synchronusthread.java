class Table{
    public void printtable(int num){
        for(int i=1;i<=10;i++){
            System.out.print(num*i+" ");
        }
        System.out.println();
    }
    
}
class Tableprint extends Thread{
    Table t;
    int num;
    public Tableprint(Table t,int num){
        this.t=t;
        this.num=num;
    }
    public void run(){
        try{
            synchronized (t){
                t.printtable(num);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Synchronusthread {
    public static void main(String[] args) {

        Table t=new Table();
        Tableprint t1=new Tableprint(t, 2);
        Tableprint t2=new Tableprint(t, 3);
        Tableprint t3=new Tableprint(t, 4);
        Tableprint t4=new Tableprint(t, 5);
        Tableprint t5=new Tableprint(t, 6);
        Tableprint t6=new Tableprint(t, 7);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

        
        
    }
}
