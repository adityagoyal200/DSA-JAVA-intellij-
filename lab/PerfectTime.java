package lab;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PerfectTime extends UnicastRemoteObject implements PerfectTimeI {
    protected PerfectTime() throws RemoteException {
    }

    public long getPerfectTime() throws RemoteException{
        return System.currentTimeMillis();
    }

    @Override
    public String getTime() throws RemoteException {
        return null;
    }
}


