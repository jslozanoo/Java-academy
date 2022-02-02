package Topic1.FirstExercise;

public class musicDevice implements musicDevicePlan {
    private String color;
    private int capacity;
    private int batteryDuration;

    @Override
    public void setColor(String color) {
        this.color = color;

    }
    public String getColor(){return this.color;}

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;

    }
    public int getCapacity(){return this.capacity;}

    @Override
    public void setBattery(int battery) {
        this.batteryDuration = battery;

    }
    public int getBatteryDuration(){return this.batteryDuration;}

    @Override
    public String toString() {
        return "musicDevice{" +
                "color = '" + this.color + '\'' +
                ", capacity = " + this.capacity + " gb" +
                ", batteryDuration = " + this.batteryDuration + " hours" +
                '}';
    }
}
