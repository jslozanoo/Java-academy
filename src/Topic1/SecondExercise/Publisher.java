package Topic1.SecondExercise;

public interface Publisher {
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public void notifySubscriber(Message m);


}
