package bank;

public class BankAccount {
    private int accountNumber;
    private String accountOwner;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOwner(){
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner){
        this.accountOwner = accountOwner;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}
