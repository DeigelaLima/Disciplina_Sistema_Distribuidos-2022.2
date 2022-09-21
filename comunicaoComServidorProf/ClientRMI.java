import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry("172.18.102.141");
			HelloRMI helloRMIStub = (HelloRMI)registry.lookup("HelloRMI");
			String msg = helloRMIStub.sayHello();
			helloRMIStub.talkToServer("Brena e Andreina");
			System.out.println(msg);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
