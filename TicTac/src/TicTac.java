class Reloj {
	boolean tic;

	public Reloj() {
		this.tic = true;
	}

	public synchronized void tic() {
		try {
			while (tic == false) {
				wait();
			}
			System.out.println("TIC");
			tic = false;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void tac() {
		try {
			while (tic) {
				wait();
			}
			System.out.println("TAC");
			tic = true;
			notifyAll();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class HiloTic extends Thread {
	Reloj reloj;

	public HiloTic(Reloj reloj) {
		this.reloj = reloj;
	}

	public void run() {
		reloj.tic();
	}
}

class HiloTac extends Thread {
	Reloj reloj;

	public HiloTac(Reloj reloj) {
		this.reloj = reloj;
	}

	public void run() {
		reloj.tac();
	}
}

public class TicTac {
	public static void main(String[] args) {
		Reloj reloj = new Reloj();
		int veces = 10;
		
		for (int i = 0; i < veces; i++) {
			HiloTic tic = new HiloTic(reloj);
			HiloTac tac = new HiloTac(reloj);
			tic.setName("TIC");
			tic.start();
			tac.setName("TAC");
			tac.start();
		}
	}
}