package ufcqx.comunicacao.serial;

public class MainThreadSerial {
	
	public static void main(String[] args) {
		int res1, res2, res3;
		
		System.out.println("=====================================================");
		System.out.println("                 CLASSE PRINCIPAL - SERIAL           ");
		System.out.println("=====================================================");
		WorkerThreadSerial wt1 = new WorkerThreadSerial(1);
		WorkerThreadSerial wt2 = new WorkerThreadSerial(2);
		WorkerThreadSerial wt3 = new WorkerThreadSerial(3);
		
		long start = System.currentTimeMillis(); //método de chamar a hora atual em milissegundos  
		res1 = wt1.work(10);
		res2 = wt2.work(20);
		res3 = wt3.work(30);
		
		long end = System.currentTimeMillis(); //método de chamar a hora atual em milissegundos 
		System.out.println(res1 + " " + res2 + " " + res3 + ", em " + (end-start) + " milissegundos."); // Hora Final(end) menos a hora Inicial(START)
		
	}

}
