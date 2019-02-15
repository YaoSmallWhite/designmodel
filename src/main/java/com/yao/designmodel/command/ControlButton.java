package com.yao.designmodel.command;

/**
 * Description:
 * Creator: yaoxiang(ys1892)
 * Date: 2019-01-17
 * Time: 16:09
 */
public class ControlButton {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    void press(){
        command.execute();
    }
}
