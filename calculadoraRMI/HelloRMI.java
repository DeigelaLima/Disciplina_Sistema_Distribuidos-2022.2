import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloRMI extends Remote{
	
	String sayHello() throws RemoteException;
	Integer somar(Integer x, Integer y) throws RemoteException;
	Integer subtracao(Integer x, Integer y) throws RemoteException;
	Integer multiplicacao(Integer x, Integer y) throws RemoteException;
	Double divisao(Double x, Double y) throws RemoteException;

}
