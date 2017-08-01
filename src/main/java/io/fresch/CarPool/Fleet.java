package io.fresch.CarPool;

import io.fresch.CarPool.DI.DaggerFleetComponent;

import javax.inject.Inject;

/**
 * Created by fresch on 12.02.17.
 */
public class Fleet {

    @Inject
    Van van;

    @Inject
    Wagon wagon;

    // let's assume it's a constructor you can't change - so no @Inject here
    // @Inject - would work as long as you have providers for all args, otherwise .inject(this)
    public Fleet() {

        System.out.println("create fleet");
        DaggerFleetComponent.create().inject(this);
    }
}
