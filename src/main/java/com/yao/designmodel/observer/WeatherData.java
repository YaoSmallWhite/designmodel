package com.yao.designmodel.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-08
 * Time: 19:28
 */
@Data
public class WeatherData implements Subject {
    /**
     * 保存Observer
     */
    private List<Observer> list;
    private float temperature;
    private float pressure;

    public WeatherData(){
        list=new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        list.forEach(observer -> observer.update(temperature,pressure));
    }

    public void setFiled(float temperature,float pressure){
        this.temperature=temperature;
        this.pressure=pressure;
        //通知观察者
        notifyObservers();
    }
}
