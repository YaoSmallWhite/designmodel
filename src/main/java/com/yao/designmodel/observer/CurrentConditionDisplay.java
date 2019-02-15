package com.yao.designmodel.observer;

import javax.sound.midi.Soundbank;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-08
 * Time: 19:45
 */
public class CurrentConditionDisplay implements DisplayElement,Observer {
    private float temperature;
    private float pressure;
    @Override
    public void display() {
        System.out.println("temperature="+temperature+",pressure="+pressure);
    }

    @Override
    public void update(float temperature, float pressure) {
        this.pressure=pressure;
        this.temperature=temperature;
        display();
    }
}
