package com.yao.designmodel.decorator;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-09
 * Time: 16:41
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //不加调料+
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+":"+beverage.cost());
        //加入摩卡
        beverage=new Mocha(beverage);
        System.out.println(beverage.getDescription()+":"+beverage.cost());
        //加入奶泡
        beverage=new Whip(beverage);
        System.out.println(beverage.getDescription()+":"+beverage.cost());
    }
}
