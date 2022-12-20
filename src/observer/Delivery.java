package observer;

public class Delivery {
    public static void main(String[] args) {
        Client client = new Client();
        DeliveryMan deliveryMan = new DeliveryMan();

        /** Add an notification **/
        deliveryMan.addNotification(client);

        /** Monitore all events **/
        deliveryMan.start();

    }
}
