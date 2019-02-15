package com.yao.designmodel.observer.javaapi;



/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-08
 * Time: 20:00
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
         ConditionDisplay conditionDisplay=new ConditionDisplay();
        weatherData.addObserver(conditionDisplay);
        weatherData.setFiled(11.5f,20);
        weatherData.setFiled(21.6f,31);
    }
}
