package com.yao.designmodel.abstractfactory;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-15
 * Time: 19:37
 */
public class GoodPizza extends Pizza {
    public GoodPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }
}
