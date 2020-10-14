package com.educy.Factory.method;




/**
 * @Author 马小姐
 * @Date 2020-10-14 10:07
 * @Version 1.0
 * @Description:
 */
public class Customer {
    public static void main(String[] args) {
        Car car = new WuliinghongguangFactory().getCar();
        car.name();

        Car car1 = new DazhongFactory().getCar();
        car1.name();
    }
}
