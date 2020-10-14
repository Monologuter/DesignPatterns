package com.educy.Factory.method;

/**
 * @Author 马小姐
 * @Date 2020-10-14 10:53
 * @Version 1.0
 * @Description:
 */
public class WuliinghongguangFactory implements  CarFactory{


    @Override
    public Car getCar() {
        return new Wuliinghongguang();
    }
}
