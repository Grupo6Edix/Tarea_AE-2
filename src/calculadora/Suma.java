package calculadora;

/**
 * <h2>La clase Suma pertenece a la calculadora que sumara dos o tres valores n�mericos entre si.</h2>
 * 
 * @author Daviid
 * @since 19/01/2022
 * 
 * @see Producto
 * @see Resta
 * @see Cociente
 */
public class Suma {
		
	/**
	 * Atributo de clase que representa el acumulado del metodo acumulado.
	 */
	
	private static double sumaAcumulada;
		
	public static double getSumaAcumulada() {
		return sumaAcumulada;
	}
		
	/**
	 * M�todo que devuelve un valor n�merico real de <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * No se permiten n�meros negativos en los par�metros de entrada.
	 * 
	 * @param num1 representa el primer valor n�merico real que se sumara.
	 * @param num2 representa el segundo valor n�merico real que se sumara.
	 * 
	 * @return sumarDosReales suma dos n�meros reales entre si,<br>
	 * y te devuelve el valor de num1 y num2.<br>
	 * Si se introduce un n�mero negativo, devuelve c�digo de error -1.
	 */
	
	public static double sumarDosReales(double num1, double num2) {
		if (num1 < 0 || num2 < 0)
			return -1;
		else
			return (double) num1 + num2;
	}
	
	/**
	 * M�todo que devuelve un valor n�merico entero de <i>num1</i> y <i>num2</i>.<br>
	 * 
	 * No se permiten n�meros negativos en los par�metros de entrada.
	 * 
	 * @param num1 representa el primer valor n�merico entero que se sumara.
	 * @param num2 representa el segundo valor n�merico entero que se sumara.
	 * 
	 * @return sumarDosEnteros suma dos n�meros enteros entre si,<br>
	 * y te devuelve el valor de num1 y num2.<br>
	 * Si se introduce un n�mero negativo, devuelve c�digo de error -1.
	 */
	
	public static double sumarDosEnteros(int num1, int num2) {
		if (num1 < 0 || num2 < 0)
			return -1;
		else
			return num1 + num2;
	}
	
	/**
	 * M�todo que devuelve un valor n�merico real de <i>num1</i>, <i>num2</i> y <i>num3</i>.<br>
	 * 
	 * No se permiten n�meros negativos en los par�metros de entrada.
	 * 
	 * @param num1 representa el primer valor n�merico real que se sumara.
	 * @param num2 representa el segundo valor n�merico real que se sumara.
	 * @param num3 representa el tercer valor n�merico real que se sumara.
	 * 
	 * @return sumarTresReales suma tres n�meros reales entre si, y te devuelve el valor de num1,<br>
	 * num2 y num3.<br>
	 * Si se introduce un n�mero negativo, devuelve c�digo de error -1.
	 */
	
	public static double sumarTresReales(double num1, double num2, double num3) {
		if (num1 < 0 || num2 < 0 || num3 < 0)
			return -1;
		else
			return num1 + num2 + num3;
	}
		
	/**
	 * M�todo que sirve para sumar el par�metro de entrada al acumulado del m�todo.
	 * 
	 * @param numeroSumaAcumulado representa el valor n�merico real
	 * que se quiere sumar al acumulado del atributo de clase <i>sumaAcumulada</i>.<br>
	 * Si se introduce un n�mero negativo, devuelve c�digo de error -1.
	 */
	
	public static void acumulado(double num1) {
		if (num1 < 0)
			sumaAcumulada -= 0;
		else
			sumaAcumulada += num1;
	}
		
}
