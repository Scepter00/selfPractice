package chapterThree;

public class ModifiedAccountClass {

    /*(Modified Account Class) Modify class Account (Fig.3.8) to provide a method called with
draw that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
 the Account’s balance. If it does, the balance should be left unchanged and the method should print
 a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
 (Fig.3.9) to test method withdraw.*/

    private String name;
    private double balance;

    public ModifiedAccountClass(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
        }
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > 0) {
            if (withdrawalAmount <= balance) {
                balance -= withdrawalAmount;
            } else {
                System.out.println("Withdrawal amount exceeded account balance.");
            }
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
