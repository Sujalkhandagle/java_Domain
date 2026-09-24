class Bankaccount{
    private int blance=1000;
    synchronized void with(int amount){
        if(blance>=amount){
            System.out.println(Thread.currentThread().getName()+ " withdraw "+amount);
            System.out.println("Reemaing balance := "+blance);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" insufficent balance plsese tya again");
        }
    }
    synchronized void deposite(int amount){
        blance+=amount;
        System.out.println((Thread.currentThread().getName()+ "  depositing"+amount));
    }
}

class Customer extends Thread{
    Bankaccount account;
    Customer(Bankaccount account){
        this.account=account;
    }
    public void run(){

        account.with(10000);  
    }
}
public class Mainapp2 {
    public static void main(String[] args) throws Exception {

        Bankaccount account=new Bankaccount();
        Customer c1=new Customer(account);
        Customer c2=new Customer(account);

        c1.setName("vijay");
        c2.setName("sham");

        account.deposite(50000);


        c1.start();
        c2.start();

        c1.join();
        c2.join();


        
    }
}
