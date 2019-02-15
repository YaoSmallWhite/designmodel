package com.yao.designmodel.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Description:
 * @Author: ys1892
 * @Date: 2019-02-12
 * @Time: 14:17
 */
public class Client {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        RemoteService service = (RemoteService) Naming.lookup("rmi://127.0.0.1/sayHello");
        service.sayHello();
    }
}
