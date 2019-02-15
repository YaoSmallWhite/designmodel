package com.yao.designmodel.adapter;

/**
 * Description: 适配器对象 使用turkey提供duck功能
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-23
 * Time: 14:58
 */
public class DuckAdapter implements Duck {
    private Turkey turkey;
    public DuckAdapter(Turkey turkey){
        this.turkey=turkey;
    }
    @Override
    public void say() {
        turkey.say();
    }
}
