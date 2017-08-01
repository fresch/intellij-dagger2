package io.fresch.CarPool.DI;

import dagger.Component;
import io.fresch.CarPool.Fleet;

/**
 * Created by fresch on 12.02.17.
 */
@VehicleScope
@Component(modules = {FleetModule.class})
public interface FleetComponent {

    Fleet provideFleet();
    void inject(Fleet fleet);
}
