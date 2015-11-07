package tp3funciones.operacionesbinarias;

import tp3funciones.numericos.Numero;

/** Operacion binaria suma */
public class OperacionSuma extends OperacionBinaria{

//METODOS-------------------------------------------------------------------------------------------------------------------------------------------
	/** Operacion: Sumar
	 * @param valor1 Numero a sumar
	 * @param valor2 Numero a sumar
	 * @return Resultado de la suma */
	@Override
	public Numero aplicarOperacion(double valor1, double valor2) {
		return new Numero( valor1+valor2 );
	}
}
