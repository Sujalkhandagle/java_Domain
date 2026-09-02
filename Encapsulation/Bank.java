package Encapsulation;

public class Bank {
    int id;
    String name;
    int balance;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        if(id == 123)

            return balance;
        else
            return -1;

        
        
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    
}
