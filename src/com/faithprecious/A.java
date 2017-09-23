package com.faithprecious;

/**
 * Created by faithpercious on 2017/9/23.
 */
public class A extends Car{
    public A() {
        this.name="奔驰";
        this.price=500;
        this.capacity1=4;
        this.capacity2=0;
        this.a=1;
        this.b=0;
    }

    @Override
    public void transport() {
        System.out.println(this.getName()+"\t"+this.getPrice()+"元/天\t"+"载人数为："+this.capacity1+"人");
    }
}
