package com.yao.designmodel.abstractfactory;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-15
 * Time: 19:33
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Clams clams;
    PizzaIngredientFactory pizzaIngredientFactory;
    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory=pizzaIngredientFactory;
    }
    void prepare(){
        dough=pizzaIngredientFactory.createDough();
        clams=pizzaIngredientFactory.createClams();
    }
}
