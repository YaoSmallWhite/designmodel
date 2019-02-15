package com.yao.designmodel.decorator;

/**
 * Description: 具体装饰类
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-09
 * Time: 16:32
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public double cost() {
        return 1.5+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }
}
