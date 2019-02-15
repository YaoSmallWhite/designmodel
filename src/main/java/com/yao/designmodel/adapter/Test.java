package com.yao.designmodel.adapter;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-23
 * Time: 15:01
 */
public class Test {
    public static void main(String[] args) {
        Turkey turkey =new RedTurkey();
        Duck adapter=new DuckAdapter(turkey);
        adapter.say();
    }
}
