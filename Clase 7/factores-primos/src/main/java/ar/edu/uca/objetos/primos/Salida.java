package ar.edu.uca.objetos.primos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Salida {

	private File archivoSalida;

	public Salida(String nombreArchivo) {
		if (nombreArchivo != null) {
			archivoSalida = new File(nombreArchivo);
		}
	}

	public void ejecutarSalida(StringBuilder contenido) {
		if (archivoSalida == null)
			System.out.println(contenido);
		else {
			try (FileOutputStream output = new FileOutputStream(archivoSalida)) {
				output.write(contenido.toString().getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
