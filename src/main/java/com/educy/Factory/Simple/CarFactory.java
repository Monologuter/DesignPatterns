package com.educy.Factory.Simple;

/**
 * @Author 马小姐
 * @Date 2020-10-14 10:10
 * @Version 1.0
 * @Description:
 */
public class CarFactory {
    public static Car getCar(String car){
        if(car.equals("五菱")){
            return new Wuliinghongguang();
        }else if (car.equals("大众")){
            return new Dazhong();
        }else {
            return  null;
        }
    }
}
