package com.example.springbootdemo.fan;

import java.util.Random;

public class FruitGenerator implements Generator<String> {

    private String[] fruits = new String[]{"apple","banan","bear"};

    @Override
    public String next() {
        Random random = new Random();
        return fruits[random.nextInt(3)];
    }
}
