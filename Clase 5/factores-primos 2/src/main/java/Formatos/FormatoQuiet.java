package Formatos;

import java.util.List;

public class FormatoQuiet extends Formato {

	@Override
	public String formatear(List<Integer> valores) {
		StringBuilder cadenaRetorno = new StringBuilder();
		for (Integer valorInt : valores) {
			if (cadenaRetorno.length() == 0) {
				cadenaRetorno.insert(0, valorInt);
			} else {
				cadenaRetorno.insert(0, valorInt + "\r\n");
			}
		}
		return cadenaRetorno.toString();
	}
}
