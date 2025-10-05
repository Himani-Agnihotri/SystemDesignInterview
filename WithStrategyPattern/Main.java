package WithStrategyPattern;
public class Main {
    public static void main(String args[]){
        WithStrategyPattern.Vehicle vehicle = new WithStrategyPattern.OffRoadVehicle();
        vehicle.drive();
    }
}
