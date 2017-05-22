package Formatos;

import java.util.List;

public class FormatoDefault extends Formato {

	@Override
	public String formatear(List<Integer> valores) {
		return new FormatoPretty().formatear(valores);
	}

}
