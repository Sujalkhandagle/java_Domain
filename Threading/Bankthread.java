class Banktranstion extends Thread{
    private String tranctionname;
    public Banktranstion(String name){
        this.tranctionname=name;
    }
    public void run(){
        System.out.println(tranctionname+" started");
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(tranctionname+" completed");
    }
}
public class Bankthread {
    public static void main(String[] args) {

        Banktranstion t1=new Banktranstion("Deposite");
        Banktranstion t2=new Banktranstion("Withdraw");

        t1.start();
        t2.start();

        
    }
}
