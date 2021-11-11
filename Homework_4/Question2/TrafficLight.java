package Question2;

public class TrafficLight {
    //the traffic light is green at first
    private final Signal signal;

    public TrafficLight() {
        signal = new Signal();
    }

    public void carArrived(
        int carID, // ID of the car
        int roadId,  // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
        int direction,  // Direction of the car
        Runnable turnGreen, // Use turnGreen.run() to turn light to green on current road
        Runnable crossCar  // Use crossCar.run() to make car cross the intersection
    ){
        synchronized (signal){
            if(signal.greenRoad != roadId){
                // Use turnGreen.run() to turn light to green on current road
                turnGreen.run();
                signal.greenRoad = roadId;
            }
            // Use crossCar.run() to make car cross the intersection
            crossCar.run();
        }
    }

}
