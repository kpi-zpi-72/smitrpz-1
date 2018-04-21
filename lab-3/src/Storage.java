import java.util.HashMap;
import java.util.UUID;

public class Storage {

    HashMap cardsList;
    public Card issueCard(String type, Integer trips) {
        final String uuid = UUID.randomUUID().toString().replace("-", "");
        System.out.println("uuid = " + uuid);
        Card newCard = new Card(uuid, type, trips);
        this.cardsList.put(uuid, newCard);
        return newCard;
    };
    public void blockCard(Card card) {

        this.cardsList.remove(card.id);

    };
}
