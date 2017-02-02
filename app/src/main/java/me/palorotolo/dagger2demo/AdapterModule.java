package me.palorotolo.dagger2demo;

import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yao on 2017/2/2.
 */

@Module
public class AdapterModule {

    @Provides
    public BaseAdapter provideAdapter() {
        UserAdapter userAdapter = new UserAdapter(getStrings());
        return userAdapter;
    }

    public List<String> getStrings() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            strings.add("items" + i);
        }
        return strings;
    }
}
