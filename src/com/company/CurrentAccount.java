package com.company;

public class CurrentAccount extends Account{
    public int ALLOWED_TRANSACTIONS = 8;
    private int noOfTransactionPerMonth;

    public int getNoOfTransactionPerMonth() {
        return noOfTransactionPerMonth;
    }

    public void setNoOfTransactionPerMonth(int noOfTransactionPerMonth) {
        this.noOfTransactionPerMonth = noOfTransactionPerMonth;
    }

    @Override
    public float calculateInterest() {
        float interest = 0;
        if(noOfTransactionPerMonth<ALLOWED_TRANSACTIONS){
            interest = (float) (getBalance() * getNoOfYears() * 3/100);
        }
        return interest;
    }
}
