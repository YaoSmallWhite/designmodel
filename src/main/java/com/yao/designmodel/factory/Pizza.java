package com.yao.designmodel.factory;

/**
 * Description:产品类
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-14
 * Time: 17:16
 */
public abstract class Pizza {
    String name;
    double price;

    public Pizza() {
    }

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void bake(){
        System.out.println("开始烘烤"+name+"披萨");
    }
    public void cut(){
        System.out.println("开始切"+name+"披萨");
    }
}
