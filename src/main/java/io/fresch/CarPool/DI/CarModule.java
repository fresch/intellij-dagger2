package io.fresch.CarPool.DI;

import dagger.Module;
import dagger.Provides;
import io.fresch.CarPool.Coupe;
import io.fresch.CarPool.Fleet;

/**
 * Created by fresch on 12.02.17.
 */
// provide coupe since it's an object missing the @Inject constructor
@Module
public class CarModule {

    @Provides
    public Coupe getCoupe() {

        return new Coupe(200);
    }
}
