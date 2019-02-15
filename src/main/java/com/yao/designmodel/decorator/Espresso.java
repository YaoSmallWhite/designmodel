package com.yao.designmodel.decorator;

/**
 * Description: 具体被装饰类
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-09
 * Time: 16:39
 */
public class Espresso extends Beverage {
    public  Espresso(){
        description="Espresso";
    }
    @Override
    public double cost() {
        return 5;
    }
}
