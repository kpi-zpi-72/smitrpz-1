public class TicketController {
    Storage storage;
    public boolean allowAccess(Card card) {
        return true;
    };
    private boolean checkIfCardIsValid(Card card) {
        return this.storage.cardsList.containsKey(card.id);
    };
    private void charge(Card card) {
        if(card.type == "weekday" || card.type == "weekend") {
            card.trips = card.trips - 1;
        }

    };
    private boolean checkIfTripIsAvailable(Card card) {
        if(card.type == "weekday" || card.type == "weekend") {
            return card.trips > 0;
        }
        return true;
    }
    TicketController() {
        this.storage = new Storage();
    }
}
