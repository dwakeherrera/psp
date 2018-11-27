public class LanzaHilos211 {
	public static void main(String args[]) {
		HiloEspera hilo1 = new HiloEspera(3);
		HiloEspera hilo2 = new HiloEspera(5);
		HiloEspera hiloDaemon = new HiloEspera(20);
		hiloDaemon.setDaemon(true);
		hilo1.setName("hilo 1");
		hilo2.setName("hilo 2");
		hiloDaemon.setName("hilo daemon");
		hilo1.start();
		hilo2.start();
		hiloDaemon.start();
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrumpido. ");
			return;
		}
		//hilo1.interrupt();
	}
}
