package ufcqx.comunicacao.serial;

public class WorkerThreadSerial {

	private int  id;
	
	public WorkerThreadSerial(int id) {
		this.id = id;
	}
	
	public int work(int in) {
		System.out.println("-----------------------------------------------------");
		System.out.println("Worker " + this.id + " começou a trabalhar....       ");
		System.out.println("-----------------------------------------------------");
		
		try {
			//vai esperar por 2s
			Thread.sleep(2000);
		}
		//Essa exceção é lançada quando uma Theread está aguardando, dormindo 
		//ou pausada e uma outra Thread a interrompe.
		catch (InterruptedException e) {
			//identificará a linha exata na qual o método gerou a exceção
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("Worker " + this.id + " terminou de trabalhar....     ");
		System.out.println("-----------------------------------------------------");

		
		return in * 10;
	}
}
