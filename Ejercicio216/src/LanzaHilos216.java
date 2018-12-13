
public class LanzaHilos216 {
	public static void main(String[] args) {
		Contador contador = new Contador(100);

		HiloSumador hs = new HiloSumador("HiloSumador", contador,  300);
		HiloRestador hr = new HiloRestador("HiloRestador", contador, 300);

		Contador.mostrarValor();
		System.out.println("Voy a lanzar los hilos");
		hs.start();
		hr.start();

		try {
			hs.join();
			hr.join();
		} catch (InterruptedException e) {e.printStackTrace(); }

		Contador.mostrarValor();
	}
}
