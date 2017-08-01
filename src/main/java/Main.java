import io.fresch.CarPool.*;
import io.fresch.CarPool.DI.CarPoolComponent;
import io.fresch.CarPool.DI.DaggerCarPoolComponent;
import io.fresch.CarPool.DI.DaggerFleetComponent;
import io.fresch.CarPool.DI.FleetComponent;

/**
 * Created by fresch on 12.02.17.
 */
public class Main {

    public static void main(String[] args) {

        CarPoolComponent carPoolComponent = DaggerCarPoolComponent.create();
        CarPool carPool = carPoolComponent.provideCarPool();
        System.out.println("CarPool Size: " + carPool.getCarCount());

        FleetComponent fleetComponent = DaggerFleetComponent.create();
        Fleet fleet = fleetComponent.provideFleet();
    }
}
