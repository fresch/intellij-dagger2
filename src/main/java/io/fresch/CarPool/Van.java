package io.fresch.CarPool;

import io.fresch.CarPool.DI.VehicleScope;

import javax.inject.Inject;
import javax.inject.Scope;

/**
 * Created by fresch on 12.02.17.
 */
@VehicleScope
public class Van implements Car {

    @Inject
    public Van() {

        System.out.println("assembled Van");
    }
}
