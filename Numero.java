package tp3funciones.numericos;

import java.util.Stack;

import tp3funciones.ItemFuncion;

/** Representa un numero (literales numéricos) */
public class Numero extends ItemFuncion{
	
//ATRIBUTOS y PROPIEDADES---------------------------------------------------------------------------------------------------------------------------
	/** Valor del numero */
	private double valor;
	/** Valor del numero 
	 * @return Valor del numero */
	public double getValor(){return valor;}
	/** Valor del numero 
	 * @param valor Nuevo valor del numero*/
	public void setValor(double valor){this.valor = valor;}

//CONSTRUCTORES-------------------------------------------------------------------------------------------------------------------------------------
	/** Representa un numero (literales numéricos) 
	 * @param Valor del numero*/
	public Numero(double valor){this.valor = valor;	}
	
//METODOS-------------------------------------------------------------------------------------------------------------------------------------------
	/** Operacion: Apilar el numero
	 * @param pila Pila utilizada para resolver las operaciones */
	protected void operar(Stack<ItemFuncion> pila){ pila.push(this);};
}
