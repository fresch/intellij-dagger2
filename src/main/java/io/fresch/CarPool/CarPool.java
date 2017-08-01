package io.fresch.CarPool;

import io.fresch.CarPool.DI.CarPoolComponent;
import io.fresch.CarPool.DI.DaggerCarPoolComponent;

import javax.inject.Inject;

/**
 * Created by fresch on 12.02.17.
 */
public class CarPool {

    private SUV suv;
    private Pickup pickup;
    private Coupe coupe;

    // would be injected because of @Inject CarPool constructor
    /*
    @Inject
    Van van;
    @Inject
    Wagon wagon;
    */

    @Inject
    public CarPool(SUV suv, Pickup pickup, Coupe coupe) {

        this.suv = suv;
        this.pickup = pickup;
        this.coupe = coupe;

        System.out.println("create carpool");
    }

    public Integer getCarCount() {

        return 4;
    }
}
