package com.company;

public class SavingsAccount extends Account{
    private float minBalance;

    public float getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(float minBalance) {
        this.minBalance = minBalance;
    }

    @Override
    float calculateInterest() {
        float interest = 0;
        if(getBalance()>minBalance){
            if(getBalance()>200000)
                interest = (float) (getBalance() * getNoOfYears() * 4/100);
            else
                interest = (float) (getBalance() * getNoOfYears() * 3.5/100);
        }
        return interest;
    }
}
