package com.yao.designmodel.abstractfactory;


/**
 * Description:创建者类，定义抽象工厂方法，让子类实现 创建产品
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-14
 * Time: 17:05
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza=createPizza(type);
        return pizza;
    }

    /**
     * 工厂方法，申明为抽象 由子类实现
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
