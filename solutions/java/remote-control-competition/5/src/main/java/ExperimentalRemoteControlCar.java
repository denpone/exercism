public class ExperimentalRemoteControlCar implements RemoteControlCar, Cloneable{
    private int distanceTravelled = 0;

    public void drive() {
        distanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
