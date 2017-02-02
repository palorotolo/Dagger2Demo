package me.palorotolo.dagger2demo;

import dagger.Component;

/**
 * Created by yao on 2017/2/2.
 */

@Component(modules = {AdapterModule.class})
public interface AdapterComponent {
    void inject(MainActivity mainActivity);
}
