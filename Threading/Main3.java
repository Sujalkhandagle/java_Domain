
class Message{
    String msg;
    boolean availbe=false;
    synchronized void recive(){
        while (!availbe) {
            try{
            System.out.println("reciver wait for .....");
            wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
            
        }
        System.out.println("Recived msg := "+msg);
    }
    synchronized void send(String msg){
        this.msg=msg;
        availbe=true;
        System.out.println("message sent := "+msg);
        notify();
    }

}

class Sender extends Thread{
    Message message;
    Sender(Message message){
      this.message=message;
    }
    public void run(){
        message.send("hello i am sender");
    }
}
class Reciver extends Thread{
    Message message;
    Reciver(Message message){
        this.message=message;
    }
    public void run(){
        message.recive();
    }
}
public class Main3 {
    public static void main(String[] args) {
        Message message=new Message();
        Sender sender=new Sender(message);
        Reciver reciver=new Reciver(message);


        reciver.start();
        sender.start();
        
    }
}
