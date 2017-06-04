package ar.edu.uca.objetos.formatos;

import java.util.List;

public class FormatoPretty extends Formato {

	@Override
	public StringBuilder formatear(List<Integer> valores, Integer valorTotal) {
		StringBuilder cadenaRetorno = new StringBuilder();

		cadenaRetorno.insert(0, "Factores Primos " + valorTotal + ": ");

		for (Integer valorInt : valores) {
			cadenaRetorno.append(valorInt + " ");
		}
		return cadenaRetorno;
	}

}
