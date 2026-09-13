
package trinhquanghuy_9694.lec11_Encapsulation.AccessModifier.Exercise15;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        }

        System.out.println("Cannot withdraw!");
        return false;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }

    void addInfo() {
        accountNumber = "123456";
        owner = "Trinh Quang Huy";
        balance = 1000000;
    }
}
