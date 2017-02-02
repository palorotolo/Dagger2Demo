package me.palorotolo.dagger2demo;

import dagger.Component;

/**
 * Created by yao on 2017/2/2.
 */

@Component(modules = {FruitModule.class})
public interface FruitComponent {
    void inject(MainActivity mainActivity);
}
