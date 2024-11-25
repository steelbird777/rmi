import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatorImpl implements Calculator {

    protected CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public int square(int x) throws RemoteException {
        return x * x;
    }

    @Override
    public int cube(int x) throws RemoteException {
        return x * x * x;
    }

    
}
