package com.yao.designmodel.factory;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-14
 * Time: 17:24
 */
public class ChinaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza=null;
        if (type.equals("lemon")){
            pizza=new ChinaLemonPizza("lemon",25);
        }else if (type.equals("beef")){
            pizza=new ChinaBeefPizza("beaf",36.5);
        }
        return pizza;
    }
}
