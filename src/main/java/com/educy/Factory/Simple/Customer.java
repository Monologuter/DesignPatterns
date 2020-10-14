package com.educy.Factory.Simple;

/**
 * @Author 马小姐
 * @Date 2020-10-14 10:07
 * @Version 1.0
 * @Description:
 */
public class Customer {
    public static void main(String[] args) {
//        Dazhong dazhong = new Dazhong();
//        dazhong.name();

//        Wuliinghongguang wuliinghongguang = new Wuliinghongguang();
//        wuliinghongguang.name();

        Car wuliinghongguang  = CarFactory.getCar("五菱");
        wuliinghongguang.name();

        Car Dazhong = CarFactory.getCar("大众");
        Dazhong.name();


    }
}
