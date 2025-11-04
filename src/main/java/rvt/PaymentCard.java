package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public String toString() {
        String text = "The card has a balance of " + balance + " euros";
        return text;
    }

    public void eatAffordably() {
        
    }

    public void eatHeartily() {
        
    }
}