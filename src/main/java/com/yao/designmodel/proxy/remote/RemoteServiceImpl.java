package com.yao.designmodel.proxy.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Description:
 * @Author: ys1892
 * @Date: 2019-02-12
 * @Time: 14:08
 */
public class RemoteServiceImpl extends UnicastRemoteObject implements RemoteService {
    protected RemoteServiceImpl() throws RemoteException {
    }

    @Override
    public String sayHello() {
        return "hello";
    }

    public static void main(String[] args) {
        try{
            RemoteService service=new RemoteServiceImpl();
            Naming.rebind("sayHello",service);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
