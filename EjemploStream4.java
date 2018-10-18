import java.io.*;
import java.util.*;

public class EjemploStream4 {
	public static void main(String args[]) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("java", "HolaMundo4");
		pb.directory(new File("/home/davher/eclipse-workspace/Holamundo4/bin"));
		Process process = pb.start();
		OutputStream os = process.getOutputStream();
		
		os.write("David\n".getBytes());
		os.flush();
		
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line;
		System.out.println("Salida del proceso " + Arrays.toString(args) + " :");
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
