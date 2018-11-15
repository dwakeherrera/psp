import java.util.Scanner;

public class LanzaHilos {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);

		System.out.print("Cuántos hilos quieres crear: ");
		int veces = tcl.nextInt();
		tcl.close();
		
		CrearHilos[] hilos = new CrearHilos[veces];
		
		for (int i = 0; i < hilos.length; i++ ) {
			hilos[i] = new CrearHilos(String.valueOf(i));
			hilos[i].start();
		}
	}
}
