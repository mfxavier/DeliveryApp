package observer;

import java.util.Date;
/**
 * Main Class that determine events
 * **/
public class DeliveryMealsEvent {
    private final Date hourOfDelivery;

    public DeliveryMealsEvent(Date hourOfDelivery) {
        super();
        this.hourOfDelivery = hourOfDelivery;
    }

    public Date getHourOfDelivery() {
        return hourOfDelivery;
    }
}
