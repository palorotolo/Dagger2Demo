package me.palorotolo.dagger2demo;

/**
 * Created by yao on 2017/2/2.
 */

public class Apple extends Fruit {

    private String color;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                '}';
    }
}
