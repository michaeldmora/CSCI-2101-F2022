package Banks;

public class BankAccountTester {
    
        public static void main(String[] args) {
            System.out.println("Welcome to Bank Account Tester");
            // Create a BankAccount object\
            // ClassName Name = new ClassName();
            BankAccount account1 = new BankAccount("Bob", 100);
            System.out.println(account1.getName());
            System.out.println(account1.getBalance());

            BankAccount account2 = new BankAccount();
            System.out.println(account2.getName());
            System.out.println(account2.getName());

            account1.deposit(100);
            System.out.println(account1.getName() + ", Your balance is " +(account1.getBalance() +"."));
            account1.monthlyFee(10);
            System.out.println(account1.getName() + ", Your balance is " +(account1.getBalance() +"."));

        }
    
}
