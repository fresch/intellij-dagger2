package io.fresch.CarPool;

import javax.inject.Inject;

/**
 * Created by fresch on 12.02.17.
 */
public class Pickup implements Car {

    @Inject
    public Pickup() {

        System.out.println("assembled pickup");
    }
}
