
package trinhquanghuy_9694.lec11_Encapsulation.Exercise9;

public class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}
