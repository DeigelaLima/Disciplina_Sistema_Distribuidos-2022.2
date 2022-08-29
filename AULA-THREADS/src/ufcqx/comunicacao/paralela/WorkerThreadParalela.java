package ufcqx.comunicacao.paralela;

public class WorkerThreadParalela extends Thread{
	
	private int id;
	private int in;
	private int out;
	
	public WorkerThreadParalela(int id) {
		this.id = id;
	}
	
	@Override
	/*É o método que executa as atividades de uma thread. 
	 *Quando este método finaliza, a thread também termina.*/
	public void run() {
		this.work();
	}
	
	public void work() {
		//System.out.println("-----------------------------------------------------");
		System.out.println("Worker " + this.id + " começou a trabalhar....       ");
		//System.out.println("-----------------------------------------------------");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println("-----------------------------------------------------");
		System.out.println("Worker " + this.id + " terminou de trabalhar....     ");
		//System.out.println("-----------------------------------------------------");
		
		this.out = this.in * 10;
	}

	public int getln() {
		return in;
	}
	
	public void setln(int in) {
		this.in = in;
	}
	
	public int getOut() {
		return out;
	}
	
	public void setOut(int out) {
		this.out = out;
	}
}
