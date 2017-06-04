package ar.edu.uca.objetos.formatos;

import java.util.List;

public abstract class Formato {
	public abstract StringBuilder formatear(List<Integer> valores, Integer valorTotal);
}
