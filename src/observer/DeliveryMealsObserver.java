package observer;
/** Class that determine all interested **/
public interface DeliveryMealsObserver {
    public void hasArrived(DeliveryMealsEvent event);
}
