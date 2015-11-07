package tp3funciones.operacionesunarias;

import tp3funciones.numericos.Numero;

public class OperacionLogaritmo extends OperacionUnaria {

	@Override
	public Numero aplicarOperacion(double numero) {return new Numero( (int)Math.log(numero) );}

}
