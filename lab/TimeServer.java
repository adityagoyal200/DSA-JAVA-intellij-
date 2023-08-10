package lab;

import java.rmi.Naming;

public class TimeServer {
    public static void main(String[] args) throws Exception {
        PerfectTimeI rmobj = new PerfectTime();
        Naming.rebind("//localhost:1212/objec", rmobj);
        System.out.println("ready to go");
    }
}
