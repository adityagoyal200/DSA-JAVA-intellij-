package lab;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PerfectTimeI extends Remote {
    String getTime() throws RemoteException;
}


