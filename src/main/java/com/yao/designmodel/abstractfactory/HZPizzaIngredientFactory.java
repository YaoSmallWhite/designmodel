package com.yao.designmodel.abstractfactory;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-15
 * Time: 19:19
 */
public class HZPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new HZDough("杭州面团");
    }

    @Override
    public Clams createClams() {
        return new HZClams("杭州蛤蜊");
    }
}
