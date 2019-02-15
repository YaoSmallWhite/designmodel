package com.yao.designmodel.singleton;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-17
 * Time: 15:32
 */
public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
