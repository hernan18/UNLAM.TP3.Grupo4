package tp3funciones.operacionesbinarias;

import tp3funciones.numericos.Numero;

/** Operacion binaria potenciacion */
public class OperacionPotenciacion extends OperacionBinaria{
	
//METODOS-------------------------------------------------------------------------------------------------------------------------------------------
	/** Operacion: Elevar
	 * @param valor1 Base
	 * @param valor2 Exponente
	 * @return Resultado de la potenciacion */
	@Override
	public Numero aplicarOperacion(double valor1, double valor2) {
		return new Numero( Math.pow(valor1,valor2) ) ;
	}
}
