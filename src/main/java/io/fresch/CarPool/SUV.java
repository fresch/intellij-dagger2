package io.fresch.CarPool;

import javax.inject.Inject;

/**
 * Created by fresch on 12.02.17.
 */
public class SUV implements Car {

    @Inject
    public SUV() {

        System.out.println("assembled SUV");
    }
}
