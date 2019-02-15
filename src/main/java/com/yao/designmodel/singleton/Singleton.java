package com.yao.designmodel.singleton;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-17
 * Time: 15:28
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance(){
        if (singleton==null){
            //只有第一次创建时才会同步此方法
            synchronized (Singleton.class){
                if (singleton==null) {
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}
