package calculadora;

/**
 * <h2>Clase que representa todos los m�todos relacionados con una divisi�n</h2><br>
 * 
 * Esta clase ser� usada por una calculadora.
 * 
 * @author Jorge
 * @since 25/01/2022
 * 
 * @see Producto
 * @see Resta
 * @see Suma
 */

public class Cociente {
	
	/**
	 * M�todo que devuelve un valor num�rico real
	 * resultado de la divisi�n de los par�metros <i>dividendoReal</i> y <i>divisorReal</i>.<br>
	 * 
	 * Si se introduce el valor 0 en el par�metro divisorReal,
	 * se producir� un error por excepci�n aritm�tica.<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.
	 * 
	 * @param dividendoReal representa el valor num�rico real del dividendo de la divisi�n.
	 * @param divisorReal representa el valor num�rico real del divisor de la divisi�n.
	 * 
	 * @return Devuelve un <u>valor num�rico real</u> siendo el resultado del dividendo entre el divisor.
	 */

	public double divisionReal(double dividendoReal, double divisorReal) {
		return dividendoReal / divisorReal;
	}
	
	/**
	 * M�todo que devuelve un valor num�rico real
	 * resultado de la divisi�n de los par�metros <i>dividendoEntero</i> y <i>divisorEntero</i>.<br>
	 * 
	 * Si se introduce el valor 0 en el par�metro <i>divisorEntero</i>,
	 * se producir� un error por excepci�n aritm�tica.<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.<br>
	 * 
	 * Debido a que existen posibilidades de que la divisi�n de n�meros enteros no devuelva valor entero, 
	 * se hace un cast a tipo <i>double</i> de la divisi�n de los par�metros dividendoEntero y 
	 * divisorEntero y el tipo del m�todo ser�a double.
	 * 
	 * @param dividendoEntero representa el valor num�rico entero del dividendo de la divisi�n.
	 * @param divisorEntero representa el valor num�rico entero del divisor de la divisi�n.
	 * 
	 * @return Devuelve un <u>valor num�rico real</u> siendo el resultado del dividendo entre el divisor.
	 */
	
	public double divisionEntera(int dividendoEntero, int divisorEntero) {
		return (double) dividendoEntero / divisorEntero;
	}
	
	/**
	 * M�todo que devuelve el inverso de un n�mero real.<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.<br>
	 * 
	 * El par�metro de entrada se utiliza de divisor del n�mero 1 para conseguir su inverso multiplicativo.
	 * 
	 * @param numeroReal representa el valor num�rico real que se quiere invertir.
	 * @return Devuelve un <u>valor num�rico real</u> siendo el inverso multiplicativo del par�metro.
	 */
	
	public double inverso(double numeroReal) {	
        return 1 / numeroReal;
	}
	
	/**
	 * M�todo que devuelve la raiz cuadrada del par�metro introducido en la clase <i>Math.sqrt().</i>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.
	 * 
	 * @param numeroReal representa el valor num�rico real del cual se quiere calcular su raiz cuadrada.
	 * @return Devuelve el <u>valor real de la raiz cuadrada</u> del valor proporcionado en el par�metro.
	 */
	
	public double raiz(double numeroReal) {
		return Math.sqrt(numeroReal);
	}
	
	
}
