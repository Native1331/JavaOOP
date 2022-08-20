package data;

public class UnionPayCard extends Card {
    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }



    public boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.CN)
            return true;
        else
            return false;
    }
}
