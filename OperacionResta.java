package tp3funciones.operacionesbinarias;

import tp3funciones.numericos.Numero;

/** Operacion binaria resta*/
public class OperacionResta extends OperacionBinaria {

//METODOS-------------------------------------------------------------------------------------------------------------------------------------------
	/** Operacion: Restar
	 * @param valor1 Numero a ser restado
	 * @param valor2 Numero a restar
	 * @return Resultado de la resta */
	@Override
	public Numero aplicarOperacion(double valor1, double valor2) {
		return new Numero(valor1-valor2);
	}
}
