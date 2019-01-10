import java.util.concurrent.Semaphore;

public class HiloSumador extends Thread {
	public Contador contador;
	public int cuenta;
	public Semaphore sem;
	public String nombreHilo;

	public HiloSumador() {
	}

	public HiloSumador(String nombre, Contador cont, int cuenta, Semaphore sem) {
		this.nombreHilo = nombre;
		this.contador = cont;
		this.cuenta = cuenta;
		this.sem = sem;
	}
	
	public void run() {
		for (int i = 0; i < cuenta; i++) {
			try {
				sem.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contador.incrementa();
			sem.release();
		}
		System.out.println("Al finalizar " + getName() + " el contador vale " + contador.valor());
	}
}
