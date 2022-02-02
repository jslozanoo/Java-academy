package Topic1.FirstExercise;

public class testMusicDevice {
    public static void main(String[] args){
        musicDeviceBuilder newDeviceBuilder = new oldMusicDeviceBuilder();

        musicDeviceDirector deviceDirector = new musicDeviceDirector(newDeviceBuilder);

        deviceDirector.makeMusicDevice();

        musicDevice firstMusicDevice = deviceDirector.getMusicDevice();
        System.out.println(firstMusicDevice.toString());


    }
}
