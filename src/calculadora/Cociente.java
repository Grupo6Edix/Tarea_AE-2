package calculadora;

/**
 * <h2>Clase que representa todos los métodos relacionados con una división</h2><br>
 * 
 * Esta clase será usada por una calculadora.
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
	 * Método que devuelve un valor numérico real
	 * resultado de la división de los parámetros <i>dividendoReal</i> y <i>divisorReal</i>.<br>
	 * 
	 * Si se introduce el valor 0 en el parámetro divisorReal,
	 * se producirá un error por excepción aritmética.<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.
	 * 
	 * @param dividendoReal representa el valor numérico real del dividendo de la división.
	 * @param divisorReal representa el valor numérico real del divisor de la división.
	 * 
	 * @return Devuelve un <u>valor numérico real</u> siendo el resultado del dividendo entre el divisor.
	 */

	public double divisionReal(double dividendoReal, double divisorReal) {
		return dividendoReal / divisorReal;
	}
	
	/**
	 * Método que devuelve un valor numérico real
	 * resultado de la división de los parámetros <i>dividendoEntero</i> y <i>divisorEntero</i>.<br>
	 * 
	 * Si se introduce el valor 0 en el parámetro <i>divisorEntero</i>,
	 * se producirá un error por excepción aritmética.<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.<br>
	 * 
	 * Debido a que existen posibilidades de que la división de números enteros no devuelva valor entero, 
	 * se hace un cast a tipo <i>double</i> de la división de los parámetros dividendoEntero y 
	 * divisorEntero y el tipo del método sería double.
	 * 
	 * @param dividendoEntero representa el valor numérico entero del dividendo de la división.
	 * @param divisorEntero representa el valor numérico entero del divisor de la división.
	 * 
	 * @return Devuelve un <u>valor numérico real</u> siendo el resultado del dividendo entre el divisor.
	 */
	
	public double divisionEntera(int dividendoEntero, int divisorEntero) {
		return (double) dividendoEntero / divisorEntero;
	}
	
	/**
	 * Método que devuelve el inverso de un número real.<br>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.<br>
	 * 
	 * El parámetro de entrada se utiliza de divisor del número 1 para conseguir su inverso multiplicativo.
	 * 
	 * @param numeroReal representa el valor numérico real que se quiere invertir.
	 * @return Devuelve un <u>valor numérico real</u> siendo el inverso multiplicativo del parámetro.
	 */
	
	public double inverso(double numeroReal) {	
        return 1 / numeroReal;
	}
	
	/**
	 * Método que devuelve la raiz cuadrada del parámetro introducido en la clase <i>Math.sqrt().</i>
	 * 
	 * No se podrán utilizar valores negativos en los parámetros de entrada.
	 * 
	 * @param numeroReal representa el valor numérico real del cual se quiere calcular su raiz cuadrada.
	 * @return Devuelve el <u>valor real de la raiz cuadrada</u> del valor proporcionado en el parámetro.
	 */
	
	public double raiz(double numeroReal) {
		return Math.sqrt(numeroReal);
	}
	
	
}
