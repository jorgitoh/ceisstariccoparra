package ar.edu.uca.objetos.primos;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Factores primos " + args[0] + ": "
				+ obtenerFactores(Integer.parseInt(args[0]), 2, ""));

	}

	// Carece de importancia evaluar los primos, ya que en cierta forma el
	// metodo obtener factores lo hace
	public static boolean validarPrimo(int numero) {
		boolean primo = true;
		for (int x = 2; x < numero; x++) {
			if (numero % x == 0)
				return false;
		}
		return primo;
	}

	public static String obtenerFactores(int numero, int valorDivisor,
			String cadena) {
		if (numero != valorDivisor)
			if (numero % valorDivisor == 0) {
				cadena += valorDivisor + " ";
				return obtenerFactores(numero / valorDivisor, valorDivisor,
						cadena);
			} else {
				return obtenerFactores(numero, valorDivisor + 1, cadena);
			}
		else
			cadena += valorDivisor + " "; 
		return cadena;
	}
}
