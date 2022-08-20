import data.Card;
import data.UnionPayCard;
import data.VisaCard;

import java.util.ArrayList;
import java.util.List;

import static data.Country.RU;

public class Main {
    public static void main(String[] args) {
        invoke(new UnionPayCard());
        List<String> aList = new ArrayList<>();
    }

    public static void invoke(Card card) {
        card.setBalance(100);
        card.payInCountry(RU,50);
        System.out.println("Current balance: "+card.getBalance());
    }
}
