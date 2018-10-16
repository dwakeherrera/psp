import java.io.*;
import java.util.*;

public class EjemploStream2 {
	public static void main(String args[]) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("ls", "-a");
		Process process = pb.start();
		InputStream is = process.getErrorStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line;
		System.out.println("Salida del proceso " + Arrays.toString(args) + " :");
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		System.out.println();
		
		InputStream ise = process.getInputStream();
		InputStreamReader isre = new InputStreamReader(ise);
		BufferedReader bre = new BufferedReader(isre);
		while ((line = bre.readLine()) != null) {
			System.out.println(line);
		}
	}
}
