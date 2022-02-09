package calculadora;

/**
 * <h2>Clase que representa todos los métodos relacionados con una resta</h2><br>
 * 
 * Esta clase será usada por una calculadora.
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
	 * Atributo de clase que representa el acumulado del resultado del método acumulado().
	 */
	
	private static double restaAcumulada;
	
	public static double getRestaAcumulada() {
		return restaAcumulada;
	}

	/**
	 * Método que devuelve un valor numérico real
	 * resultado de la resta de dos parámetros: <i>numero1Real</i> y <i>numero2Real</i>.<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.<br>
	 * 
	 * @param numero1Real representa el valor numérico real del primer parámetro de la resta.
	 * @param numero2Real representa el valor numérico real del segundo parámetro de la resta.
	 * 
	 * @return Devuelve un <u>valor numérico real</u> siendo el resultado de la resta entre
	 * los dos parámetros.
	 */

	public double restaReal(double numero1Real, double numero2Real ) {
	
	}	
		
	/**
	 * Método que devuelve un valor numérico entero
	 * resultado de la resta de dos parámetros: <i>numero1Entero</i> y <i>numero2Entero</i>.<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.<br>
	 * 
	 * @param numero1Entero representa el valor numérico entero del primer parámetro de la resta.
	 * @param numero2Entero representa el valor numérico entero del segundo parámetro de la resta.
	 * 
	 * @return Devuelve un <u>valor numérico entero</u> siendo el resultado de la resta entre
	 * los dos parámetros.
	 */
		
	public int restaEntera(int numero1Entero, int numero2Entero ) {	
		
	}
	
	/**
	 * Método que devuelve un valor numérico real
	 * resultado de la resta de tres parámetros: <i>numero1Entero</i>, 
	 * <i>numero2Entero</i> y <i>numero3Real</i> .<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.<br>
	 * 
	 * @param numero1Real representa el valor numérico real del primer parámetro de la resta.
	 * @param numero2Real representa el valor numérico real del segundo parámetro de la resta.
	 * @param numero3Real representa el valor numérico real del tercer parámetro de la resta.
	 * 
	 * @return Devuelve un <u>valor numérico entero</u> siendo el resultado de la resta entre
	 * los tres parámetros.
	 */
	
	public double restaRealTriple(double numero1Real, double numero2Real, double numero3Real) {	
        
	}
	
	/**
	 * Método que sirve para restar el parámetro de entrada al acumulado del método.
	 * 
	 * Para ello, se acumula el valor del parámetro <i>numeroRestaAcumulado</i>
	 * en el atributo de clase <i>restaAcumulada</i>, el cual restará a ese acumulada los siguientes
	 * valores que se introduzcan del parámetro.
	 * 
	 * @param numeroRestaAcumulado representa el valor numérico real que se quiere restar
	 * al acumulado del método.
	 */
	
	public static void acumulado(double numeroRestaAcumulado) {
		
	}
	
}
