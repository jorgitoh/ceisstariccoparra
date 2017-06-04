package ar.edu.uca.objetos.primos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ar.edu.uca.objetos.formatos.Formato;
import ar.edu.uca.objetos.formatos.FormatoDefault;
import ar.edu.uca.objetos.formatos.FormatoPretty;
import ar.edu.uca.objetos.formatos.FormatoQuiet;

public class Programa {

	public static void main(String[] args) {
		analizarArgumentos(args);
	}

	public static void analizarArgumentos(String[] args) {
		Integer valor = Integer.parseInt(args[0]);
		Formato formateador = new FormatoDefault();
		String rutaArchivo = null;
		EnumOrden ordenDatos = EnumOrden.asc;
		// Analizo los Parametros
		for (int i = 0; i < args.length; i++) {
			// Analizar formato
			if (args[i].toLowerCase().startsWith("--format=")) {
				if (args[i].toLowerCase().equals("--format=pretty")) {
					formateador = new FormatoPretty();
				} else if (args[i].toLowerCase().equals("--format=quiet")) {
					formateador = new FormatoQuiet();
				}
			}

			// Analizar salida
			if (args[i].toLowerCase().startsWith("--output-file=")) {
				rutaArchivo = args[i].split("=")[1];
			}

			// Analizar orden
			if (args[i].toLowerCase().startsWith("--sort=")) {
				if (args[i].toLowerCase().equals("--sort=desc")) {
					ordenDatos = EnumOrden.desc;
				}
			}
		}

		realizarOperaciones(valor, formateador, ordenDatos, new Salida(
				rutaArchivo));
	}

	public static void realizarOperaciones(Integer valor, Formato formato,
			EnumOrden orden, Salida salida) {
		List<Integer> resultados = new ArrayList<Integer>();
		obtenerFactores(valor, 2, resultados);
		if (orden.equals(EnumOrden.desc)) {
			Collections.reverse(resultados);
		}

		salida.ejecutarSalida(formato.formatear(resultados, valor));
	}

	public static List<Integer> obtenerFactores(int numero, int valorDivisor,
			List<Integer> valores) {
		if (numero != valorDivisor)
			if (numero % valorDivisor == 0) {
				valores.add(valorDivisor);
				return obtenerFactores(numero / valorDivisor, valorDivisor,
						valores);
			} else {
				return obtenerFactores(numero, valorDivisor + 1, valores);
			}
		else
			valores.add(valorDivisor);
		return valores;
	}
}
