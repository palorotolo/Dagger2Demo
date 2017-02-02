package me.palorotolo.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.BaseAdapter;
import android.widget.ListView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Inject
    BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        DaggerAdapterComponent.builder()
                .adapterModule(new AdapterModule())
                .build()
                .inject(this);

        listView.setAdapter(adapter);
    }
}
