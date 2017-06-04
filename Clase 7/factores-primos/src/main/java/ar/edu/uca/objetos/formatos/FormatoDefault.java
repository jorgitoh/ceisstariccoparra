package ar.edu.uca.objetos.formatos;

import java.util.List;

public class FormatoDefault extends Formato {

	@Override
	public StringBuilder formatear(List<Integer> valores,Integer valorTotal) {
		return new FormatoPretty().formatear(valores,valorTotal);
	}

}
