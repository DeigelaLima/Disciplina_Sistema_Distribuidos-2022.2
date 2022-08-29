package ufcqx.comunicacao.paralela;

public class MainThreadParalela {
	//https://www.devmedia.com.br/o-uso-de-threads-em-java-e-suas-peculiaridades/29318
	public static void main(String[] args) {
		
		System.out.println("=====================================================");
		System.out.println("              CLASSE PRINCIPAL - PARALELO            ");
		System.out.println("=====================================================");
		WorkerThreadParalela wt1 = new WorkerThreadParalela(1);
		WorkerThreadParalela wt2 = new WorkerThreadParalela(2);
		WorkerThreadParalela wt3 = new WorkerThreadParalela(3);
		wt1.setln(10);
		wt1.setln(20);
		wt1.setln(30);
		
		/*
		 * Iniciando threads em paralelo, será criada uma nova Thread em memória 
		 * (juntamente com a Thread main que já existia, pois ela fica viva enquanto o programa estiver rodando)*/
		long start = System.currentTimeMillis();
		wt1.start();
		wt2.start();
		wt3.start();
		//Conta quantas Threads estão ativas. Vai ser 4 Threads contanto com main.
		//System.out.println("THREADS ATIVAS = "+Thread.activeCount());

		//BARREIRA
		try {
			//join() é usado para adicionar sequenciamento
			//entre vários threads, um thread inicia a execução após o 
			//término da primeira execução do thread.
			wt1.join();
			wt2.join();
			wt3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Mostra o tempo de execução da Threads
		long end = System.currentTimeMillis();
		
		System.out.println(wt1.getOut() + 
				" " + wt2.getOut() 
				+ " " + wt3.getOut() + " , em " + (end-start) + " milissegundos.");

	}

}

/*
 * Imagine agora que você precisa garantir que a Thread wt1 seja executada por completo antes que a Thread wt2 inicie,
 * por diversas questão, como por exemplo: Garantir a consistência dos dados que serão lidos na wt2 que por algum motivo 
 * necessitam de um processamento prévio da wt1. Garantimos isso através do método “join()” da Classe Thread, 
 * onde iremos dizer a Thread main que só irá passar para a próxima linha, após toda execução da Thread wt1 terminar.
 * */
