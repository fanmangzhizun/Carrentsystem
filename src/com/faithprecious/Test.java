package com.faithprecious;

import java.util.Scanner;

/**
 * Created by faithpercious on 2017/9/23.
 */
public class Test {

    public static void main(String[] args) {
        final int count=5;
        System.out.println("欢迎使用凡芒公司的租车系统");
        System.out.println("请输入0或1进行选择是否进入系统"+"\n"+"0:退出"+"\t"+"1:进入系统");
        Scanner scanner=new Scanner(System.in);
        int code=scanner.nextInt();
        if (code==1){
            System.out.println("以下是可租选的清单"+"\n"+"序列号"+"\t"+"汽车名称\t"+"租金\t\t容量");
            Car[] cars=new Car[5];
            cars[0]=new A();
            cars[1]=new B();
            cars[2]=new C();
            cars[3]=new D();
            cars[4]=new E();
            for (int i=0;i<count;i++){
                System.out.print(i+1+"\t\t");
                cars[i].transport();
            }
            System.out.println("请输入选择租车的数量为");
            int icount=scanner.nextInt();
            if (icount>count){
                System.out.println("对不起，您输入的数量有误，再见");
                return;
            }
            int[] num=new int[icount];
            System.out.println("请输入选择的租车序号：");
            for (int i=0;i<icount;i++){
              num[i]=scanner.nextInt()-1;
            }
            System.out.println("请选择租车天数：");
            int days=scanner.nextInt();
            int totalprice =0;
            int iperson=0;
            int igoods=0;

           for (int i=0;i<icount;i++){//第一次遍历算出总价格以及判断出载人车型和数量
               totalprice+=cars[num[i]].price;
               if (cars[num[i]].a==1){
                   System.out.print("可载人的车:");
                   System.out.println(cars[num[i]].getName()+"\t");
                   iperson+=cars[num[i]].getCapacity1();
               }
           }
            System.out.println("共载人:"+iperson);

            for (int i=0;i<icount;i++){//第二次遍历判断出载物车型和数量
                if (cars[num[i]].b==1){
                    System.out.print("可载物的车:");
                    System.out.println(cars[num[i]].getName()+"\t");
                    igoods+=cars[num[i]].getCapacity2();
                }
            }
            System.out.println("共载物:"+igoods+"吨");
            System.out.println("总金额为："+totalprice*days+"元");
        }else {
            System.out.println("欢迎使用，再见");
            return;
        }
    }
}
