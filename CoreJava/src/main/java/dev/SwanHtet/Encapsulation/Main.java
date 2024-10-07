package dev.SwanHtet.Encapsulation;
public class Main {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("123456789", 1000.00);


        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + myAccount.getBalance());


        myAccount.deposit(500.00);
        System.out.println("Balance after deposit: $" + myAccount.getBalance());


        myAccount.withdraw(200.00);
        System.out.println("Balance after withdrawal: $" + myAccount.getBalance());


        myAccount.withdraw(2000.00);
        System.out.println("Balance after attempted withdrawal: $" + myAccount.getBalance());
    }
}

