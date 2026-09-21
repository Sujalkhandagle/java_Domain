class BankException extends Exception{
    String msg;

    public BankException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "BankException [msg=" + msg + "]";
    }
}
class Bank{
    int blance;

    public Bank(int blance) {
        this.blance = blance;
    }
  void with(int amt) throws BankException{
    if(blance-amt<0){
        throw new BankException("insufficent balance tyr gain");
    }
    else
        blance=blance-amt;
    System.out.println("balance after withdwral "+blance);

  }  
  void depo(int amt){
    blance=blance+amt;
    System.out.println("after add amount "+blance);

  }
}
public class Bankthrow {
    public static void main(String[] args) {
        Bank bank=new Bank(5000);
        bank.depo(5000);

        try{
        bank.with(4000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
