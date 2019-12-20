package com.example.springbootdemo.fan;

public class GenericTest {
    public static void main(String[] args) {
        Generic generic = new Generic("111111");
        Generic generic1 = new Generic(44444);
        Generic generic2 = new Generic(55.55);
        Generic generic3 = new Generic(false);
        System.out.println("测试泛型"+generic.getKey());
        System.out.println("测试泛型"+generic1.getKey());
        System.out.println("测试泛型"+generic2.getKey());
        System.out.println("测试泛型"+generic3.getKey());
        Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic<Number> gNumber = new Generic<Number>(456);
        showKeyValue1(gInteger);
    }

    public static void showKeyValue1(Generic<?> obj){
        System.out.println("obj get key is"+obj.getKey());
    }
}
