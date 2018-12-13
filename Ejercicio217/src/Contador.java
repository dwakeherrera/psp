
public class Contador {
	public static int num = 0;

	public Contador(int num) {
		Contador.num = num;
	}

	public synchronized static void incrementa() {
		num = num + 1;
	}

	public synchronized static void decrementa() {
		num = num - 1;
	}

	public void mostrarValor() {
		System.out.println("El valor actual del contador es: " + num);
	}
	
	public int valor() {
		return num;
	}
}
