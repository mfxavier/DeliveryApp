package observer;

public class Client implements DeliveryMealsObserver {
    @Override
    public void hasArrived(DeliveryMealsEvent event) {
        this.receive();
        this.makeThePayment();
        this.enjoyYourMeal();
    }

    public void receive(){
        System.out.println("Receive the delivery man...");
    }

    public void  makeThePayment(){
        System.out.println("Make the payment...");
    }

    public void  enjoyYourMeal(){
        System.out.println("Enjoy Your Meal...");
    }
}
