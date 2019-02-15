package com.yao.designmodel.abstractfactory;

/**
 * Description:披萨原料工厂类
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-15
 * Time: 19:14
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Clams createClams();
}
