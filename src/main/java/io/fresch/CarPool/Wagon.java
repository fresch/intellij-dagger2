package io.fresch.CarPool;

import io.fresch.CarPool.DI.VehicleScope;

import javax.inject.Inject;

/**
 * Created by fresch on 12.02.17.
 */
@VehicleScope
public class Wagon implements Car {

    @Inject
    public Wagon() {

        System.out.println("assembled wagon");
    }

}
