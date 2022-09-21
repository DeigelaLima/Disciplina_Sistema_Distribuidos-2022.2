import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {

	public static void main(String[] args) {
		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			HelloRMI helloRMIStub = (HelloRMI)registry.lookup("HelloRMI");
			String msg = helloRMIStub.sayHello();
			Integer soma = helloRMIStub.somar(3, 4);
			Integer subtracao = helloRMIStub.subtracao(10, 4);
			Integer multiplicacao = helloRMIStub.multiplicacao(10, 5);
			Double divisao = helloRMIStub.divisao(10.0, 2.0);
			System.out.println(msg);
			System.out.println(soma);
			System.out.println(subtracao);
			System.out.println(multiplicacao);
			System.out.println(divisao);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
