package com.yao.designmodel.decorator;

/**
 * Description: 具体装饰类,
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-09
 * Time: 16:30
 */
public class Mocha extends CondimentDecorator {
    //被装饰对象的引用
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public double cost() {
        return 2.5+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }
}
