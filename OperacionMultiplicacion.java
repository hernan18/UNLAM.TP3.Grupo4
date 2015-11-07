package tp3funciones.operacionesbinarias;

import tp3funciones.numericos.Numero;

/** Operacion binaria multiplicacion */
public class OperacionMultiplicacion extends OperacionBinaria{
	
//METODOS-------------------------------------------------------------------------------------------------------------------------------------------
	/** Operacion: Multiplicar
	 * @param valor1 Numero a multiplicar
	 * @param valor2 Numero a multiplicar
	 * @return Resultado de la multiplicacion */
	@Override
	public Numero aplicarOperacion(double valor1, double valor2) {
		return new Numero(valor1*valor2);
	}
}
