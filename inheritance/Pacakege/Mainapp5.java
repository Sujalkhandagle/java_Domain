package Pacakege;
abstract class RBIbank{
    //BEST EXAPLE OF BANKING WITHDRAW AND DEPOSIT PROCESS
    int balance;
    public RBIbank(){

    }
    public RBIbank(int balance){
        this.balance=balance;
    }
    abstract void with(int amt);
    abstract void depo(int amt);
    
    void showbalance(){
        System.out.println("Balance :="+balance);
    }

}

class Hdfcbank extends RBIbank{
    public Hdfcbank(){

    }
    public Hdfcbank(int balance){
        super(balance);
    }

    void with(int amt){
        balance=balance-amt;
    }
    void depo(int amt){
        balance=balance+amt;
    }
}




class Icicbank extends RBIbank{
    public Icicbank(){

    }
    public Icicbank(int balance){
        super(balance);
    }

    void with(int amt){
        balance=balance-amt;
    }
    void depo(int amt){
        balance=balance+amt;
    }
}



public class Mainapp5 {
    public static void main(String[] args) {

        RBIbank bank=new Hdfcbank(10000);
        bank.with(5000);
        bank.showbalance();
        bank.depo(6000);
        bank.showbalance();

        RBIbank bank1=new Icicbank(15000);
        bank1.with(3000);
        bank1.showbalance();
        bank1.depo(8000);
        bank1.showbalance();
        
    }
}
