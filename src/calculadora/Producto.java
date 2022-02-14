package calculadora;

/**
 * <h2>Clase que define los m�todos representados,
 *  y que est�n relacionados con la operaci�n matem�tica producto</h2><br>
 * 
 * Dicha clase ser� utilizada por una calculadora.
 * 
 * @author Jon
 * @since 24/01/2022
 * 
 * @see Cociente
 * @see Resta
 * @see Suma
 */

public class Producto {
	
	/**
	 * M�todo que devolver� un valor num�rico real resultado del producto 
	 * entre los factores <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * El valor que se introduzca para representar los factores <u> no podr� ser negativo</u>
	 *  ya que la calculadora no podr� utilizar valores negativos.<br>
	 * 
	 * @param num1 representa el valor num�rico real del primer factor del producto.
	 * @param num2 representa el valor num�rico real del segundo factor del producto.
	 * 
	 * @return Devolver� un <u>valor num�rico real</u> 
	 * cuyo resultado ser� el producto de los factores num1 y num2 representados anteriormente.<br>
	 * Si el valor introducido es negativo se devuelve c�digo de error -1.
	 * 
	 */
	
	public static double productoDosReales(double num1, double num2) {
			if(num1 < 0 || num2 < 0)
				return -1;
			else
			return num1 * num2;
	}
	
	/**
	 * M�todo que devolver� un valor num�rico entero resultado del producto
	 * entre los factores <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * El valor que se introduzca para representar los factores <u>no podr� ser negativo</u>
	 *  ya que la calculadora no podr� utilizar valores negativos.<br>
	 * 
	 * @param num1 representa el valor num�rico entero del primer factor del producto.
	 * @param num2 representa el valor num�rico entero del segundo factor del producto.
	 * 
	 * @return Devolver� un <u>valor num�rico entero</u> cuyo resultado ser� 
	 * el producto de los factores num1 y num2 representados anteriormente.<br>
	 * Si el valor introducido es negativo se devuelve c�digo de error -1.
	 * 
	 */
	public static int productoEntero(int num1, int num2) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else
		return num1 * num2;
	}
	
	/**
	 * M�todo que devolver� un valor num�rico real resultado del productor entre
	 * los factores <i>num1</i>, <i>num2</i> y num3.<br>
	 * 
	 * El valor que se introduzca para representar los factores <u>no podr� ser negativo</u>
	 *  ya que la calculadora no podr� utilizar valores negativos.<br>
	 * 
	 * @param num1 representa el valor num�rico real del primer factor del producto.
	 * @param num2 representa el valor num�rico real del segundo factor del producto.
	 * @param num3 representa el valor num�rico real del tercer factor del producto.
	 * 
	 * @return Devolver� un <u>valor num�rico real</u> cuyo resultado ser� 
	 * el producto de los factores num1, num2 y num3.<br>
	 * Si el valor introducido es negativo se devuelve c�digo de error -1.
	 * 
	 */
	public static double productoTresReales(double num1, double num2, double num3) {
		if(num1 < 0 || num2 < 0 || num3 <0)
			return -1;
		else
		return num1 * num2 * num3;
	}
	
	/**
	 * M�todo que devolver� un valor num�rico real resultado de la potencia entre la 
	 * base (num1) y el exponente (num2), a trav�s de la clase <i>Math.pow()</i><br>
	 * 
	 * El valor que se introduzca para representar los factores <u>no podr� ser negativo</u>
	 *  ya que la calculadora no podr� utilizar valores negativos.<br>
	 * 
	 * Se ha utilizado tipo de dato double por lo que no 
	 * habr�a problema con el valor del dato retornado si este es muy alto.
	 * 
	 * @param num1 representa el valor num�rico real de la base de la potencia.
	 * @param num2 representa el valor num�rico real del exponente de la potencia.
	 * 
	 * @return Devolver� un <u>valor num�rico real</u> cuyo resultado 
	 * ser� la potencia establecida entre los valores de num1 y num2.<br>
	 * Si el valor introducido es negativo se devuelve c�digo de error -1.
	 * 
	 */
	
	public static double potencia(double num1, double num2) {
		if(num1 < 0 || num2 < 0)
			return -1;
		else
		return Math.pow(num1, num2);
	}
}
