
public class CrearHilos extends Thread {
	public CrearHilos(String nombre) {
		this.setName(nombre);
	}

	public void run() {
		System.out.println("Lanzando el " + getName() + ":");
		System.out.println(getName());
		System.out.println("Finalizando el " + getName());

		System.out.println("Soy el " + getName() + " empezando.");
		try {
			this.sleep(10000);
			// También se puede hacer así y lo aplicará al hilo actual.
			// Thead.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(getName() + " interrumpido.");
			return;
		}
		System.out.println(getName() + " acabado.");
	}
}
