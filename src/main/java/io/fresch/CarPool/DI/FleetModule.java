package io.fresch.CarPool.DI;

import dagger.Module;
import dagger.Provides;
import io.fresch.CarPool.Fleet;

/**
 * Created by fresch on 12.02.17.
 */
@Module
public class FleetModule {

    @Provides
    public Fleet provideFleet() {
        return new Fleet();
    }
}
