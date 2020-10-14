package com.educy.Factory.method;

/**
 * @Author 马小姐
 * @Date 2020-10-14 10:52
 * @Version 1.0
 * @Description:
 */
public class DazhongFactory implements  CarFactory {

    @Override
    public Car getCar() {
        return new Dazhong();
    }
}
