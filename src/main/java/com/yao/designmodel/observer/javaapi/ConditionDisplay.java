package com.yao.designmodel.observer.javaapi;

import com.yao.designmodel.observer.DisplayElement;
import lombok.Data;

import javax.sound.midi.Soundbank;
import java.util.Observable;
import java.util.Observer;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-08
 * Time: 19:57
 */
@Data
public class ConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float pressure;
    @Override
    public void display() {
        System.out.println("temperature="+temperature+",pressure="+pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData=(WeatherData)o;
        this.pressure=weatherData.getPressure();
        this.temperature=weatherData.getTemperature();
        display();
    }
}
