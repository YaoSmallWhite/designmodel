package com.yao.designmodel.observer;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-08
 * Time: 19:47
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay();
        weatherData.registerObserver(currentConditionDisplay);
        weatherData.setFiled(11.5f,20);
        weatherData.setFiled(21.6f,31);
    }
}
