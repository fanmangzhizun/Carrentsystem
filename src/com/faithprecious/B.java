package com.faithprecious;

/**
 * Created by faithpercious on 2017/9/23.
 */
public class B extends Car {
    public B() {
        this.name="特斯拉";
        this.price=800;
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
