package data;



public class MasterCard extends Card{
    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }


public boolean isCountryValidForTheseCard(Country country){
        return true;
}
}
