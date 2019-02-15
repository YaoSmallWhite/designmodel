package com.yao.designmodel.decorator;

/**
 * Description: 所有饮料的超类
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-09
 * Time: 16:24
 */
public abstract class Beverage {
    String description="no description";
    public abstract  double cost();
    public String getDescription(){
        return description;
    }
}
