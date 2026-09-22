class Mythread extends Thread{
    Mythread(){
        this.setName("demo thread");
        System.out.println("started := "+getName());
        start();
    }

    public void run(){

        try{

        for(int i=10;i<=50;i+=10){
            System.out.println("i := "+i);
            sleep(500);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }

    System.out.println("child thread terminated....");
    }
}
public class Multithreading {
    public static void main(String[] args) {
        new Mythread();

        System.out.println("main thread starting....");
        try{
            for(int i=1;i<=5;i++){
                System.out.println("maim := "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("main thread termieted...");
        
    }
}
