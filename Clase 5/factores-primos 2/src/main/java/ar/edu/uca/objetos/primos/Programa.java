package ar.edu.uca.objetos.primos;

import java.util.ArrayList;
import java.util.List;

import Formatos.Formato;
import Formatos.FormatoDefault;
import Formatos.FormatoPretty;
import Formatos.FormatoQuiet;

public class Programa {

	public static void main(String[] args) {
		if (args.length == 1) {
			System.out.println(formatear(Integer.parseInt(args[0]), null));
		} else if (args.length == 2) {
			System.out.println(formatear(Integer.parseInt(args[0]), args[1]));
		}
	}

	public static String formatear(Integer valorBase, String formato) {
		Formato formateador;

		if (formato == null) {
			formateador = new FormatoDefault();
			return formateador.formatear(obtenerFactores(valorBase, 2,
					new ArrayList<Integer>()));
		}

		if (formato.toLowerCase().equals("--format=pretty")) {
			formateador = new FormatoPretty();
			return formateador.formatear(obtenerFactores(valorBase, 2,
					new ArrayList<Integer>()));

		} else if (formato.toLowerCase().equals("--format=quiet")) {
			formateador = new FormatoQuiet();
			return formateador.formatear(obtenerFactores(valorBase, 2,
					new ArrayList<Integer>()));
		} else
			return "Formato no aceptado. Las opciones posibles son: pretty o quiet.";

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
