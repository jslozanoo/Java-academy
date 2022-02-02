package Topic1.FirstExercise;

import Topic1.FirstExercise.musicDevice;
import Topic1.FirstExercise.musicDeviceBuilder;

import java.util.Locale;
import java.util.Scanner;

public class oldMusicDeviceBuilder implements musicDeviceBuilder {
    private Topic1.FirstExercise.musicDevice musicDevice;
    Scanner in = new Scanner(System.in);

    // Constructor
    public oldMusicDeviceBuilder(){
        this.musicDevice = new musicDevice();
    }
//Here we're going to build the musicDeviceObject via its interface.
    @Override
    public void buildColor() {
        String color = "";
        while (!color.toLowerCase(Locale.ROOT).equals("green")){
            System.out.println("Choose the color: red or green (type red or green)");
            color = in.nextLine();
            if (color.toLowerCase(Locale.ROOT).equals("red")){
                break;
            }
        }
        musicDevice.setColor(color.toLowerCase(Locale.ROOT));

    }

    @Override
    public void buildCapacity() {
        int capacity = 0;
        while (capacity != 8){
            System.out.println("Choose the capacity: 8 or 16 gb (type 8 or 16 only)");
            capacity = in.nextInt();
            if (capacity == 16){
                break;
            }
        }
        musicDevice.setCapacity(capacity);
    }

    @Override
    public void buildBatteryDuration() {
        int battery = 0;
        while (battery != 5){
            System.out.println("Choose the battery duration: 5 or 8 hours (type 5 or 8 only)");
            battery = in.nextInt();
            if (battery == 8){
                break;
            }
        }
        musicDevice.setBattery(battery);

    }
    public musicDevice getMusicDevice(){
        return this.musicDevice;
    }
}
