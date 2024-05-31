package chapterFour;

public class CreditLimitCalculator {
    private int accountNumber;
    private double beginningBalance;
    private double totalCharges;
    private double totalCredit;
    private double creditLimit;

    public CreditLimitCalculator(int accountNumber, double beginningBalance, double totalCharges,
                                 double totalCredit, double creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.totalCharges = totalCharges;
        this.totalCredit = totalCredit;
        this.creditLimit = creditLimit;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBeginningBalance(double beginningBalance) {
        this.beginningBalance = beginningBalance;
    }
    public double getBeginningBalance() {
        return beginningBalance;
    }

    public void setTotalCharges(double totalCharges) {
        this.totalCharges = totalCharges;
    }
    public double getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCredit(double totalCredit) {
        this.totalCredit = totalCredit;
    }
    public double getTotalCredit() {
        return totalCredit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    public double getCreditLimit() {
        return creditLimit;
    }

    public double newBalance() {
        return beginningBalance + totalCharges - totalCredit;
    }

    public boolean isCreditLimitExceeded() {
        return newBalance() > creditLimit;
    }
}
