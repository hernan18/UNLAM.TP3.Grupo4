package tp3funciones.operacionesunarias;

import java.util.Stack;

import tp3funciones.ItemFuncion;
import tp3funciones.numericos.Numero;

/** Representa una operacion unaria (Logaritmo)*/
public abstract class OperacionUnaria extends ItemFuncion{
	
//METODOS-------------------------------------------------------------------------------------------------------------------------------------------
	
	/** Operacion: Desapilar un numero, realizar operacion unaria (Logaritmo) y apilar resultado
	 * @param pila Pila utilizada para resolver las operaciones */
	protected void operar(Stack<ItemFuncion> pila){
		//Desapilar ultimo numero
		Numero numero = (Numero) pila.pop();
		//Realizar la operación
		Numero resultado = aplicarOperacion(numero.getValor());
		//Apilar el resultado
		pila.push(resultado);
	};
	
	/** Realiza la operacion unaria  (Logaritmo) (Composite)
	 * @param numero Numero a aplicar operacion
	 * @return Resultado de la operacion unaria */	
	protected abstract Numero aplicarOperacion(double numero);

}
