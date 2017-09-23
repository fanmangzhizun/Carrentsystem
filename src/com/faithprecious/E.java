package com.faithprecious;

/**
 * Created by faithpercious on 2017/9/23.
 */
public class E extends Car {
    public E() {
        this.name="皮卡";
        this.price=600;
        this.capacity1=2;
        this.capacity2=4;
        this.a=1;
        this.b=1;
    }
    @Override
    public void transport() {
        System.out.println(this.getName()+"\t"+this.getPrice()+"元/天\t"+"载人数为："+this.capacity1+"人\t"+"载货量为："+this.capacity2+"吨");
    }
}
