package com.example.springbootdemo.fan;

// T的类型是任意的
public class Generic <T>{
    private T key;
    public Generic(T key){
        this.key = key;
    }
    public T getKey(){
        return key;
    }
}
