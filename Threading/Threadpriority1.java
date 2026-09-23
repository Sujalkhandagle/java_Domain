class Threadpriority extends Thread{
    public Threadpriority(String name,int priority){
        super(name);
        setPriority(priority);
    }
    public void run(){
        System.out.println(getName()+" wuth priority"+getPriority()+" is running");
    }
}
public class Threadpriority1 {
    public static void main(String[] args) {

        Threadpriority T1=new Threadpriority("first", 8);
        Threadpriority T2=new Threadpriority("second", 7);
        Threadpriority T3=new Threadpriority("third", 5);   
        Threadpriority T4=new Threadpriority("fourth", 6);
        Threadpriority T5=new Threadpriority("fifth", 2);

        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();


        
    }
}
