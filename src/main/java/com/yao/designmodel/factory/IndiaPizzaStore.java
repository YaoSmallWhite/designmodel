package com.yao.designmodel.factory;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-14
 * Time: 17:36
 */
public class IndiaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza=null;
        if (type.equals("gali")){
            pizza=new IndiaGaliPizza("gali",25);
        }else if (type.equals("lemon")){
            pizza=new IndiaLemonPizza("lemon",30.5);
        }
        return pizza;
    }
}
