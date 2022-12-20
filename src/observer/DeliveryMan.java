package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DeliveryMan extends Thread {

    private List<DeliveryMealsObserver> observers = new ArrayList<DeliveryMealsObserver>();

    public void addNotification(DeliveryMealsObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int myValue = scanner.nextInt();

            if(myValue == 1){
                /** Create event **/
                DeliveryMealsEvent event = new DeliveryMealsEvent(new Date());

                /** Notifying the observers **/
                for (DeliveryMealsObserver observer : observers) {
                    observer.hasArrived(event);
                }
            }else {
                System.out.println("Isn't has Arrived...");
            }
        }
    }
}
