package io.fresch.CarPool.DI;

import dagger.Component;
import io.fresch.CarPool.CarPool;
import io.fresch.CarPool.Fleet;

/**
 * Created by fresch on 12.02.17.
 */
@Component(modules = {CarModule.class}, dependencies = {})
public interface CarPoolComponent {

    CarPool provideCarPool();
}
