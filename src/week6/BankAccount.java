package week6;

public class BankAccount {
    private String accountHolder;
    private double money;

    public BankAccount(String name,double balance){
        this.accountHolder=name;
        this.money=balance;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }
    public double checkBalance(){
        return this.money;
    }
    public void deposit(double amount){
        this.money+=amount;
    }
    public void withdrawl(double amount){
        this.money-=amount;
    }
    public void transfer(BankAccount other,double amount){
        this.withdrawl(amount);
        other.deposit(amount);
    }
    public boolean isOverdrawn(){
        return this.money<0;
    }
}
