import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {

    public static void main(String[] args) {
        try {

            LocateRegistry.createRegistry(1099);


            CalculatorImpl calc = new CalculatorImpl();


            Naming.rebind("rmi://localhost:1099/CalculatorService", calc);

            System.out.println("Calculator Server is running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
