package com.yao.designmodel.observer.javaapi;

import lombok.Data;

import java.util.Observable;

/**
 * Description: 继承Observable 成为一个可观察对象
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-08
 * Time: 19:55
 */
@Data
public class WeatherData extends Observable{
    private float temperature;
    private float pressure;
    public void setFiled(float temperature,float pressure){
        this.temperature=temperature;
        this.pressure=pressure;
        setChanged();
        notifyObservers();
    }
}
