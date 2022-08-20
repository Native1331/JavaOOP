package data;

public abstract class Card {

    protected String cardHolder;
    protected int balance;
    protected String cardNumber;
    protected PaymentSystem paymentSystem;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public Card(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    public void payInCountry(Country country, int amount){
        if (isCountryValidForTheseCard(country)&& isBalanceGreaterOrEqualThan(amount))
            balance = balance-amount;
        System.out.println("Accepted!");
    }

    public boolean isCountryValidForTheseCard(Country country) {
        return true;
    }

    protected boolean isBalanceGreaterOrEqualThan(int amount) {
        return balance >= amount;
    }


}
