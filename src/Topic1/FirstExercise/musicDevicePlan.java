package Topic1.FirstExercise;

public interface musicDevicePlan {
    public void setColor(String color); // Green or blue
    public void setCapacity(int capacity); // 8 or 16 gb
    public void setBattery(int batteryDuration); // 5 or 8 hours long
    // Music device plan set the method that every device has, i.e, give us the possibility to
    // customize the device, not create, but customize. Building process is in another class
}
