package com.faithprecious;

/**
 * Created by faithpercious on 2017/9/23.
 */
public class C extends Car {
    public C() {
        this.name="东风";
        this.price=400;
        this.capacity1=0;
        this.capacity2=5;
        this.a=0;
        this.b=1;
    }
    @Override
    public void transport() {
        System.out.println(this.getName()+"\t"+this.getPrice()+"元/天\t"+"载货量为："+this.capacity2+"吨");
    }
}
