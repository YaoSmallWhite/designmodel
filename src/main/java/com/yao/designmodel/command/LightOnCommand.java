package com.yao.designmodel.command;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-17
 * Time: 16:05
 */
public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
