package Banks;

public class BankAccount {
    private double balance;
    private String name;

    //Getters/Setters balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    //Getters/Setters name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Constructors
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }
    public BankAccount(double balance) {
        this.name = "No name";
        this.balance = balance;
    }
    public BankAccount() {
        this.name = "No name";
        this.balance = 0;
    }
    // Methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }



    //Create a method that will subtract a monthly fee from the balance
    public void monthlyFee(double fee) {
        withdraw(fee);
        }
}
