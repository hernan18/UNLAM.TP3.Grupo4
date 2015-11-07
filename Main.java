package tp3funciones;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		String archivo = "Ejemplo1";	//<--Ingresar nombre del archivo de entrada, sin la extension
		
		TP3Funciones tp3 = new TP3Funciones(new File("C:\\Users\\Hernan\\workspace\\TP3\\Lote de prueba\\IN\\" + archivo + ".in"),
											new File("C:\\Users\\Hernan\\workspace\\TP3\\Lote de prueba\\OUT\\Real\\" + archivo + ".out"));
		
		tp3.resolver();
	}

}
