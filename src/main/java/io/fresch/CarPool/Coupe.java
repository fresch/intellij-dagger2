package io.fresch.CarPool;

/**
 * Created by fresch on 12.02.17.
 */

public class Coupe implements Car {

    private Integer power;

    public Coupe(Integer power) {

        this.power = power;
        System.out.println("assembled coupe");
    }
}
