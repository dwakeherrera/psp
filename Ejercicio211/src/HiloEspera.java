public class HiloEspera extends Thread {
	private int espera;
	
	public HiloEspera(int espera) {
		//recibe segundos (espera) y se multiplica por 1000 para pasarlo a milisegundos
		this.espera = espera*1000;
	}
	
	@Override
	public void run() {
		System.out.println("Soy el " + Thread.currentThread().getName() + " empezando.");
		if (this.isDaemon()) System.out.println(getName() + " diu: Soc el dimoni");
		try {
			Thread.sleep(espera);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrumpido.");
			return;
		}
		System.out.println(Thread.currentThread().getName() + " acabado.");
	}
}
