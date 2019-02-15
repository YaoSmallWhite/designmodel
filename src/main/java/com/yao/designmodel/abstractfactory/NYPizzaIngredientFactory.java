package com.yao.designmodel.abstractfactory;

/**
 * Description:纽约风味原料工厂
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-15
 * Time: 19:18
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new  NYDough("纽约面团");
    }


    @Override
    public Clams createClams() {
        return new NYClams("纽约蛤蜊");
    }
}
