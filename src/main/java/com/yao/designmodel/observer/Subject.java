package com.yao.designmodel.observer;

/**
 * Description:主题接口
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-08
 * Time: 19:28
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
