
package trinhquanghuy_9694.lec11_Encapsulation.AccessModifier.Exercise15;

public class Proccess {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.addInfo();

        account.display();

        account.deposit(500000);
        account.withdraw(300000);

        account.display();
    }
}
