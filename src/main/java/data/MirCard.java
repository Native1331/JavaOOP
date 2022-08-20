package data;

public class MirCard extends Card{
    public MirCard() {
        super(PaymentSystem.MIR);
    }

    public boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}
