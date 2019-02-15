package com.yao.designmodel.abstractfactory;

import com.yao.designmodel.factory.Pizza;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-15
 * Time: 19:32
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected com.yao.designmodel.abstractfactory.Pizza createPizza(String type) {
        return null;
    }
}
