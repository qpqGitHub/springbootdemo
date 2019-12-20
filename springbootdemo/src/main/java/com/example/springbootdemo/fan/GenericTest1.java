package com.example.springbootdemo.fan;

public class GenericTest1 {
    public class Generic<T>{
        private T key;
        public Generic(T key){
            this.key = key;
        }
        public T getKey(){
            return key;
        }
        /**
         * 泛型方法 <T>，表面这是一个泛型方法。再声明一个泛型T，泛型的数量也可以是任意多个
         *
         */
        public <T> T showkeyName(Generic<T> container){
            System.out.println("Container key:"+container.getKey());
            T test = container.getKey();
            return test;
        }

    }
}