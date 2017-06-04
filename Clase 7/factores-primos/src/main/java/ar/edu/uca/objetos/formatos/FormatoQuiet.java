package ar.edu.uca.objetos.formatos;

import java.util.List;

public class FormatoQuiet extends Formato {

	@Override
	public StringBuilder formatear(List<Integer> valores, Integer valorTotal) {
		StringBuilder cadenaRetorno = new StringBuilder();
		for (Integer valorInt : valores) {
			cadenaRetorno.append(valorInt);
			if (cadenaRetorno.length() != 0) {
				cadenaRetorno.append("\r\n");
			}
		}
		return cadenaRetorno;
	}
}
