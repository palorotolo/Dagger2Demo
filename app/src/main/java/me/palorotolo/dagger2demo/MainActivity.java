package me.palorotolo.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Fruit fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerFruitComponent.builder()
                .fruitModule(new FruitModule())
                .build()
                .inject(this);

        Toast.makeText(this, fruit.toString(), Toast.LENGTH_SHORT).show();
    }
}
