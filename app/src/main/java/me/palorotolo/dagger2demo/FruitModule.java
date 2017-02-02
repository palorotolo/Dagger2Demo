package me.palorotolo.dagger2demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yao on 2017/2/2.
 */

@Module
public class FruitModule {
    @Provides
    public Fruit provideFruit() {
        return new Apple("Red");
    }
}
