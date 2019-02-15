package com.yao.designmodel.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Description:
 * @Author: ys1892
 * @Date: 2019-02-12
 * @Time: 14:07
 */
public interface RemoteService extends Remote {
    String sayHello() throws RemoteException;
}
