package WithStrategyPattern;

import Strategy.DriveStrategy;
import Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends WithStrategyPattern.Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
