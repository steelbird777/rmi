import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    public int square(int x) throws RemoteException;
    public int cube(int x) throws RemoteException;   
}