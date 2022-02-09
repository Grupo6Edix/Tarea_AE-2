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
	
	public static double getRestaAcumulada() {
		return restaAcumulada;
	}

	/**
	 * M�todo que devuelve un valor num�rico real
	 * resultado de la resta de dos par�metros: <i>numero1Real</i> y <i>numero2Real</i>.<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.<br>
	 * 
	 * @param numero1Real representa el valor num�rico real del primer par�metro de la resta.
	 * @param numero2Real representa el valor num�rico real del segundo par�metro de la resta.
	 * 
	 * @return Devuelve un <u>valor num�rico real</u> siendo el resultado de la resta entre
	 * los dos par�metros.
	 */

	public double restaReal(double numero1Real, double numero2Real ) {
	
	}	
		
	/**
	 * M�todo que devuelve un valor num�rico entero
	 * resultado de la resta de dos par�metros: <i>numero1Entero</i> y <i>numero2Entero</i>.<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.<br>
	 * 
	 * @param numero1Entero representa el valor num�rico entero del primer par�metro de la resta.
	 * @param numero2Entero representa el valor num�rico entero del segundo par�metro de la resta.
	 * 
	 * @return Devuelve un <u>valor num�rico entero</u> siendo el resultado de la resta entre
	 * los dos par�metros.
	 */
		
	public int restaEntera(int numero1Entero, int numero2Entero ) {	
		
	}
	
	/**
	 * M�todo que devuelve un valor num�rico real
	 * resultado de la resta de tres par�metros: <i>numero1Entero</i>, 
	 * <i>numero2Entero</i> y <i>numero3Real</i> .<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.<br>
	 * 
	 * @param numero1Real representa el valor num�rico real del primer par�metro de la resta.
	 * @param numero2Real representa el valor num�rico real del segundo par�metro de la resta.
	 * @param numero3Real representa el valor num�rico real del tercer par�metro de la resta.
	 * 
	 * @return Devuelve un <u>valor num�rico entero</u> siendo el resultado de la resta entre
	 * los tres par�metros.
	 */
	
	public double restaRealTriple(double numero1Real, double numero2Real, double numero3Real) {	
        
	}
	
	/**
	 * M�todo que sirve para restar el par�metro de entrada al acumulado del m�todo.
	 * 
	 * Para ello, se acumula el valor del par�metro <i>numeroRestaAcumulado</i>
	 * en el atributo de clase <i>restaAcumulada</i>, el cual restar� a ese acumulada los siguientes
	 * valores que se introduzcan del par�metro.
	 * 
	 * @param numeroRestaAcumulado representa el valor num�rico real que se quiere restar
	 * al acumulado del m�todo.
	 */
	
	public static void acumulado(double numeroRestaAcumulado) {
		
	}
	
}
