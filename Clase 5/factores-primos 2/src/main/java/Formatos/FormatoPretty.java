package Formatos;

import java.util.List;

public class FormatoPretty extends Formato {

	@Override
	public String formatear(List<Integer> valores) {

		// En este caso en particular, al pedir que se muestre el valor inicial,
		// pensamos que era mejor reconstruirlo que pasarlo por parametro

		String cadenaRetorno = "";
		Integer totalAcumulado = 1;

		for (Integer valorInt : valores) {
			cadenaRetorno += valorInt + " ";
			totalAcumulado *= valorInt;
		}
		return "Factores Primos " + totalAcumulado + ": " + cadenaRetorno;
	}

}
