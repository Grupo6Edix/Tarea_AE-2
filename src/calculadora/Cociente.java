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
	 * resultado de la divisi�n de los par�metros <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * Si se introduce el valor 0 en el par�metro <i>num2</i>,
	 * se producir� un error por excepci�n aritm�tica.<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.
	 * 
	 * @param num1 representa el valor num�rico real del dividendo de la divisi�n.
	 * @param num2 representa el valor num�rico real del divisor de la divisi�n.
	 * 
	 * @return Devuelve un <u>valor num�rico real</u> siendo el resultado del dividendo entre el divisor.<br>
	 * Si se introduce un n�mero negativo, devuelve c�digo de error -1.<br>
	 * Si se introduce el n�mero 0 en el par�metro num2, devuelve c�digo de error -2.
	 */

	public static double divisionReal(double num1, double num2) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else if (num2 == 0)
			return -2;
		else	
			return num1 / num2;
	}
	
	/**
	 * M�todo que devuelve un valor num�rico real
	 * resultado de la divisi�n de los par�metros <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * Si se introduce el valor 0 en el par�metro <i>num2</i>,
	 * se producir� un error por excepci�n aritm�tica.<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.<br>
	 * 
	 * Debido a que existen posibilidades de que la divisi�n de n�meros enteros no devuelva valor entero, 
	 * se hace un cast a tipo <i>double</i> de la divisi�n de los par�metros num1 y 
	 * num2 y el tipo del m�todo ser�a double.
	 * 
	 * @param num1 representa el valor num�rico entero del dividendo de la divisi�n.
	 * @param num2 representa el valor num�rico entero del divisor de la divisi�n.
	 * 
	 * @return Devuelve un <u>valor num�rico real</u> siendo el resultado del dividendo entre el divisor.
	 * Si se introduce un n�mero negativo, devuelve c�digo de error -1.<br>
	 * Si se introduce el n�mero 0 en el par�metro num2, devuelve c�digo de error -2.
	 */
	
	public static double divisionEntera(int num1, int num2) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else if (num2 == 0)
			return -2;
		else
			return (double) num1 / num2;
	}
	
	/**
	 * M�todo que devuelve el inverso de un n�mero real.<br>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.<br>
	 * 
	 * El par�metro de entrada num1 se utiliza de divisor del n�mero 1 para conseguir su inverso multiplicativo.
	 * 
	 * @param num1 representa el valor num�rico real que se quiere invertir.
	 * @return Devuelve un <u>valor num�rico real</u> siendo el inverso multiplicativo del par�metro.<br>
	 * Si se introduce un n�mero negativo, devuelve c�digo de error -1.
	 */
	
	public static double inverso(double num1) {	
		if(num1 < 0)
			return -1;
		else
			return 1 / num1;
	}
	
	/**
	 * M�todo que devuelve la raiz cuadrada del par�metro introducido en la clase <i>Math.sqrt().</i>
	 * 
	 * No se podr�n utilizar valores negativos en los par�metros de entrada.
	 * 
	 * @param num1 representa el valor num�rico real del cual se quiere calcular su raiz cuadrada.
	 * @return Devuelve el <u>valor real de la raiz cuadrada</u> del valor proporcionado en el par�metro.<br>
	 * Si se introduce un n�mero negativo, devuelve c�digo de error -1.
	 */
	
	public static double raiz(double num1) {
		if(num1 < 0)
			return -1;
		else
			return Math.sqrt(num1);
	}
	
	
}
