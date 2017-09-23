package com.faithprecious;

/**
 * Created by faithpercious on 2017/9/23.
 * 用于实现car
 */
public abstract class Car {
    public String name;
    public int price;
    int capacity1;//表示载人
    int capacity2;//表示载物
    int  a;//a为1可以载人
    int b;//b为1可以载物

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCapacity1() {
        return capacity1;
    }

    public int getCapacity2() {
        return capacity2;
    }

 public abstract void transport();
}
