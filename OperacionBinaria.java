package tp3funciones.operacionesbinarias;

import java.util.Stack;

import tp3funciones.ItemFuncion;
import tp3funciones.numericos.Numero;

/** Representa una operacion binaria (Sumar, restar, multiplicar, dividir, potenciacion) (Composite)*/
public abstract class OperacionBinaria extends ItemFuncion{
	
//METODOS-------------------------------------------------------------------------------------------------------------------------------------------
	/** Operacion: Desapilar dos numeros, realizar operacion binaria (Sumar,dividir, u otra) y apilar resultado
	 * @param pila Pila utilizada para resolver las operaciones */
	protected void operar(Stack<ItemFuncion> pila){
		//Desapilar los dos ultimos numero
		Numero numero2 = (Numero) pila.pop();
		Numero numero1 = (Numero) pila.pop();
		//Realizar la operación
		Numero resultado = aplicarOperacion(numero1.getValor(),numero2.getValor());
		//Apilar el resultado
		pila.push(resultado);
	};
	
	/** Realiza la operacion binaria  (Suma, resta, division, multiplicacion, potenciacion)(Composite)
	 * @param valor1 Numero antes del operador
	 * @param valor2 Numero despues del operador
	 * @return Resultado de la operacion binaria */
	protected abstract Numero aplicarOperacion(double valor1, double valor2);
}
