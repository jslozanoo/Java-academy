package Topic1.FirstExercise;

import Topic1.FirstExercise.musicDevice;
import Topic1.FirstExercise.musicDeviceBuilder;

public class musicDeviceDirector {
    private musicDeviceBuilder deviceBuilder;

    public musicDeviceDirector(musicDeviceBuilder deviceBuilder){
        this.deviceBuilder = deviceBuilder; // We put a musicDeviceBuilder object to hide the
        // building of the object
    }

    public musicDevice getMusicDevice(){
        return this.deviceBuilder.getMusicDevice();
    }

    public void makeMusicDevice(){
        this.deviceBuilder.buildColor();
        this.deviceBuilder.buildCapacity();
        this.deviceBuilder.buildBatteryDuration();
    }
}