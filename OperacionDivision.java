package tp3funciones.operacionesbinarias;

import tp3funciones.numericos.Numero;

/** Operacion binaria division */
public class OperacionDivision extends OperacionBinaria {
	
//METODOS-------------------------------------------------------------------------------------------------------------------------------------------
	/** Operacion: Dividir
	 * @param valor1 Numero a dividir
	 * @param valor2 Divisor
	 * @return Resultado de la division */
	@Override
	public Numero aplicarOperacion(double valor1, double valor2) {
		return new Numero(valor1/valor2);
	}
}
