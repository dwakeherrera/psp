import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class RunProcess2 {
	public static void main(String[] args) throws IOException {
		//Si no hay un programa a ejecutar pasado como parámetro avisamos
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		//Creamos un objeto ProcessBuilder pasando como parámetro el comando
		ProcessBuilder pb = new ProcessBuilder(args);
		
		try {
			pb.directory(new File("/home/davher/eclipse-workspace/EjemploProcessBuilder/bin"));
			//Ejecutamos el proceso
			Process process = pb.start();
			//Espera a que el proceso termine
			int retorno = process.waitFor();
			//Informamos sobre el resultado de la ejecución del proceso
			System.out.println("La ejecución de " + Arrays.toString(args) + " devuelve " + retorno);
		} catch (IOException ex) {
			//Si hay una IOException avisamos de E/S
			System.err.println("Excepción de E/S");
			System.exit(-1);
		} catch (InterruptedException ex) {
			//Avisamos si hay otro tipo de error
			System.err.println("El proceso hijo finalizó de forma incorrecta");
		}
	}
}