package calculadora;

/**
 * <h2>Clase que define los métodos representados,
 *  y que están relacionados con la operación matemática producto</h2><br>
 * 
 * Dicha clase será utilizada por una calculadora.
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
	 * Método que devolverá un valor numérico real resultado del producto 
	 * entre los factores <i>numReal1</i> y <i>numReal2</i>.<br>
	 * 
	 * El valor que se introduzca para representar los factores <u> no podrá ser negativo</u>
	 *  ya que la calculadora no podrá utilizar valores negativos.<br>
	 * 
	 * @param numReal1 representa el valor numérico real del primer factor del producto.
	 * @param numReal2 representa el valor numérico real del segundo factor del producto.
	 * 
	 * @return Devolverá un <u>valor numérico real</u> 
	 * cuyo resultado será el producto de los factores numReal1 y numReal2 representados anteriormente.
	 * 
	 */
	
	public double productoDosReales(double numReal1, double numReal2) {
			return numReal1 * numReal2;
	}
	
	/**
	 * Método que devolverá un valor numérico entero resultado del producto
	 * entre los factores <i>numEntero1</i> y <i>numEntero2</i>.<br>
	 * 
	 * El valor que se introduzca para representar los factores <u>no podrá ser negativo</u>
	 *  ya que la calculadora no podrá utilizar valores negativos.<br>
	 * 
	 * @param numEntero1 representa el valor numérico entero del primer factor del producto.
	 * @param numEntero2 representa el valor numérico entero del segundo factor del producto.
	 * 
	 * @return Devolverá un <u>valor numérico entero</u> cuyo resultado será 
	 * el producto de los factores numEntero1 y numEntero2 representados anteriormente.
	 * 
	 */
	public double productoEntero(int numEntero1, int numEntero2) {
		return numEntero1 * numEntero2;
	}
	
	/**
	 * Método que devolverá un valor numérico real resultado del productor entre
	 * los factores <i>numReal1</i>, <i>numReal2</i> y numReal3.<br>
	 * 
	 * El valor que se introduzca para representar los factores <u>no podrá ser negativo</u>
	 *  ya que la calculadora no podrá utilizar valores negativos.<br>
	 * 
	 * @param numReal1 representa el valor numérico real del primer factor del producto.
	 * @param numReal2 representa el valor numérico real del segundo factor del producto.
	 * @param numReal3 representa el valor numérico real del tercer factor del producto.
	 * 
	 * @return Devolverá un <u>valor numérico real</u> cuyo resultado será 
	 * el producto de los factores numReal1, numReal2 y numReal3.
	 * 
	 */
	public double productoTresReales(double numReal1, double numReal2, double numReal3) {
		return numReal1 * numReal2 * numReal3;
	}
	
	/**
	 * Método que devolverá un valor numérico real resultado de la potencia entre la 
	 * base y el exponente, a través de la clase <i>Math.pow()</i><br>
	 * 
	 * El valor que se introduzca para representar los factores <u>no podrá ser negativo</u>
	 *  ya que la calculadora no podrá utilizar valores negativos.<br>
	 * 
	 * Se ha utilizado tipo de dato double por lo que no 
	 * habría problema con el valor del dato retornado si este es muy alto.
	 * 
	 * @param base representa el valor numérico real de la base de la potencia.
	 * @param exponente representa el valor numérico real del exponente de la potencia.
	 * 
	 * @return Devolverá un <u>valor numérico real</u> cuyo resultado 
	 * será la potencia establecida entre los valores de base y exponente.
	 */
	
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}
