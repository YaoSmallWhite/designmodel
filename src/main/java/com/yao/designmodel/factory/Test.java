package com.yao.designmodel.factory;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-14
 * Time: 17:40
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore store=new ChinaPizzaStore();
        PizzaStore store1=new IndiaPizzaStore();
        store.orderPizza("beef");
        store1.orderPizza("gali");
    }
}
