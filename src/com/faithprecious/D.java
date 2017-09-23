package com.faithprecious;

/**
 * Created by faithpercious on 2017/9/23.
 */
public class D extends Car {
    public D() {
        this.name="雪龙";
        this.price=300;
        this.capacity1=0;
        this.capacity2=4;
        this.a=0;
        this.b=1;
    }
    @Override
    public void transport() {
        System.out.println(this.getName()+"\t"+this.getPrice()+"元/天\t"+"载货量为："+this.capacity2+"吨");
    }
}
