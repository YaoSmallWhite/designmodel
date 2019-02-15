package com.yao.designmodel.command;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-17
 * Time: 16:08
 */
public class Test {
    public static void main(String[] args) {
        ControlButton controlButton=new ControlButton();
        Light light=new Light();
        LightOnCommand command=new LightOnCommand(light);
        controlButton.setCommand(command);
        controlButton.press();
    }
}
