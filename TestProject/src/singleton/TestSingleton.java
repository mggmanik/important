package singleton;

import singleton.SingletonDemo;

public class TestSingleton {

    public static void main(String[] args) {

        SingletonDemo obj = SingletonDemo.getInstance();
        SingletonDemo obj1 = SingletonDemo.getInstance();
    }
}
