package Topic1.SecondExercise;

import java.util.ArrayList;

public class Product2 implements Publisher{
    float price;
    String name;
    ArrayList<Subscriber> subscribers = new ArrayList<>();

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product2(float price, String name){
        this.price = price;
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);

    }

    @Override
    public void notifySubscriber(Message m) {
        for(Subscriber sub:subscribers){
            sub.update(m);
        }
    }
}
