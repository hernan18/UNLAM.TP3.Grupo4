package tp3funciones.numericos;

import java.util.HashMap;

/** Representa una variable numerica */
public class Variable extends Numero {

//ATRIBUTOS y PROPIEDADES---------------------------------------------------------------------------------------------------------------------------
	/** Mapa de variables utilizado para asegurar que cada variable sea instanciada una sola vez (Singleton) */
	private static HashMap<Integer, Variable> mapaVariables = new HashMap<>();
	
	/** Nombre de la variable */
	private String nombre;
	/** Nombre de la variable
	 * @return Nombre de la variable*/
	public String getNombre(){return nombre;}

//CONSTRUCTORES-------------------------------------------------------------------------------------------------------------------------------------
	/** Representa una variable numerica
	 * Es privado, ya que para poder instanciar una nueva variable, es necesario utilizar el metodo estatico "nuevaVariable". Esto para asegurar una sola instancia de cada variable (Singleton)
	 * @param nombreVariable Nombre de la variable numerica*/
	private Variable(String nombreVariable) {
		super(Integer.MAX_VALUE);				//Valor numerico por defecto de una variable.
		nombre = nombreVariable;
	}

//METODOS-------------------------------------------------------------------------------------------------------------------------------------------	
	/** Retorna la variable (Nueva o referenciada)(Singleton)
	 * Asegura que exista una sola instancia de cada variable
	 * @param nombreVariable Nombre de la variable. Ejemplo: x
	 * @return Variable nueva o referenciada*/
	public static Variable nuevaVariable(String nombreVariable){
		//Cargar key.
		// Se utiliza el siguiente orden: x=0,y=1,z=2.
		// El objetivo es agilizar al momento de cargar los valores de los puntos, ya que la posicion del vector respeta el orden antes mencionado
		Integer key;
		if(nombreVariable.equals("x"))
			key = 0;
		else if(nombreVariable.equals("y"))
			key = 1;
		else //if(nombreVariable.equals("z"))
			key = 2;
		
		if(mapaVariables.containsKey(key)){				//Si ya existia la variable
			return mapaVariables.get(key);					//Retorna la referencia ya existente
		}else{											//Si no existia la variable
			Variable v = new Variable(nombreVariable);		//Crear nueva variable
			mapaVariables.put(key, v);						//Agregar al mapa
			return v;										//Retornar
		}
	}
	/** Define los valores de cada variable (Singleton)
	 * @param puntos Valores de las variables separada por espacios
	 * @param cantVar Cantidad de valores de variables */
	public static void definirValorVariables(String puntos,int cantVar){
		String[] punto = puntos.split(" ");											//Separar los puntos
		for(int i=0; i<cantVar; ++i){												//Recorrer los puntos
			((Variable)mapaVariables.get(i)).setValor(Integer.parseInt(punto[i]));	//Actualizar el valor de las variables con los valores de los puntos
		}
	}
}

