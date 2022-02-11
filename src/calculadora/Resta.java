package calculadora;

/**
 * <h2>Clase que representa todos los m�todos relacionados con una resta</h2><br>
 * 
 * Esta clase ser� usada por una calculadora.
 * 
 * @author Jorge
 * @since 25/01/2022
 * 
 * @see Producto
 * @see Cociente
 * @see Suma
 */

public class Resta {
	
	/**
	 * Atributo de clase que representa el acumulado del resultado del m�todo acumulado().
	 */
	
	private static double restaAcumulada;
	
	
	/**
	 * M�todo get para devolver el valor de la acumulaci�n del m�todo acumulado().
	 * 
	 * @return restaAcumulada acumulaci�n de valores de entrada del m�todo acumulado()
	 */
	
	public static double getRestaAcumulada() {
		return restaAcumulada;
	}

	/**
	 * M�todo que devuelve un valor num�rico real
	 * resultado de la resta de dos par�metros: <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.<br>
	 * 
	 * @param num1 representa el valor num�rico real del primer par�metro de la resta.
	 * @param num2 representa el valor num�rico real del segundo par�metro de la resta.
	 * 
	 * @return Devuelve un <u>valor num�rico real</u> siendo el resultado de la resta entre
	 * los dos par�metros.<br>
	 * Si se introduce un n�mero negativo, devuelve c�digo de error -1.
	 */

	public static double restaReal(double num1, double num2 ) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else
			return num1 - num2;
	}	
		
	/**
	 * M�todo que devuelve un valor num�rico entero
	 * resultado de la resta de dos par�metros: <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.<br>
	 * 
	 * @param num1 representa el valor num�rico entero del primer par�metro de la resta.
	 * @param num2 representa el valor num�rico entero del segundo par�metro de la resta.
	 * 
	 * @return Devuelve un <u>valor num�rico entero</u> siendo el resultado de la resta entre
	 * los dos par�metros.<br>
	 * Si se introduce un n�mero negativo, devuelve c�digo de error -1.
	 */
		
	public static int restaEntera(int num1, int num2 ) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else
			return num1 - num2;
	}
	
	/**
	 * M�todo que devuelve un valor num�rico real
	 * resultado de la resta de tres par�metros: <i>num1</i>, 
	 * <i>num2</i> y <i>num3</i> .<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.<br>
	 * 
	 * @param num1 representa el valor num�rico real del primer par�metro de la resta.
	 * @param num2 representa el valor num�rico real del segundo par�metro de la resta.
	 * @param num3 representa el valor num�rico real del tercer par�metro de la resta.
	 * 
	 * @return Devuelve un <u>valor num�rico entero</u> siendo el resultado de la resta entre
	 * los tres par�metros.<br>
	 * Si se introduce un n�mero negativo, devuelve c�digo de error -1.
	 */
	
	public static double restaRealTriple(double num1, double num2, double num3) {
		if(num1 < 0 || num2 < 0 || num3 < 0)
			return -1;
		else
			return num1 - num2 - num3;
	}
	
	/**
	 * M�todo que sirve para restar el par�metro de entrada al acumulado del m�todo.
	 * 
	 * Para ello, se acumula el valor del par�metro <i>num1</i>
	 * en el atributo de clase <i>restaAcumulada</i>, el cual restar� a ese acumulada los siguientes
	 * valores que se introduzcan del par�metro.
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.<br>
	 * 
	 * @param num1 representa el valor num�rico real que se quiere restar
	 * al acumulado del m�todo.<br>
	 * Si se introduce un n�mero negativo, devuelve c�digo de error 0.
	 */
	
	public static void acumulado(double num1) {
		if(num1 < 0)
			restaAcumulada -= 0;
		else
			restaAcumulada -= num1;
	}
	
}
