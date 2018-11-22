
public class LanzaHilos203 {
	public static void main (String args[]) {
		//Se crean los hilos (HiloConParametros)
		HiloConParametros hilo1 = new HiloConParametros("David", 3);
		HiloConParametros hilo2 = new HiloConParametros("Seve", 1);
		HiloConParametros hilo3 = new HiloConParametros("Rafa", 4);

		System.out.println("**Soy LanzaHilos y voy a lanzar tres hilos...**");
		hilo1.start();
		hilo2.start();
		hilo3.start();

		System.out.println("**LanzaHilos ha terminado su misión**");
	}
}
