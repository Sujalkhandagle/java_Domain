package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.setId(1);
        b1.setName("vihan");
        b1.setBalance(100000);

        if(b1.getBalance()==-1)
            System.out.println(" invalid user");

        else
            System.out.println(" valid user is blance"+b1.getBalance());


    }
}
