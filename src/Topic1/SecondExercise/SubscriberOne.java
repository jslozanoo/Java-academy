package Topic1.SecondExercise;

public class SubscriberOne implements Subscriber{
    @Override
    public void update(Message m) {
        System.out.println(m.getMessage());
    }
}
