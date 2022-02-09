package calculadora;

/**
 * <h2>La clase Suma pertenece a la calculadora que sumara dos o tres valores númericos entre si.</h2>
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
	 * Método que devuelve un valor númerico real de <i>numReal1</i> y <i>numReal2</i>.<br>
	 * 
	 * No se permiten números negativos en los parámetros de entrada.
	 * 
	 * @param numReal1 representa el primer valor númerico real que se sumara.
	 * @param numReal2 representa el segundo valor númerico real que se sumara.
	 * 
	 * @return sumarDosReales suma dos números reales entre si,<br>
	 * y te devuelve el valor de numReal1 y numReal2.
	 */
	
	public double sumarDosReales(double numReal1, double numReal2) {
			return numReal1 + numReal2;
	}
	
	/**
	 * Método que devuelve un valor númerico entero de <i>numEntero1</i> y <i>numEntero2</i>.<br>
	 * 
	 * No se permiten números negativos en los parámetros de entrada.
	 * 
	 * @param numEntero1 representa el primer valor númerico entero que se sumara.
	 * @param numEntero2 representa el segundo valor númerico entero que se sumara.
	 * 
	 * @return sumarDosEnteros suma dos números enteros entre si,<br>
	 * y te devuelve el valor de numEntero1 y numEntero2.
	 */
	
	public double sumarDosEnteros(int numEntero1, int numEntero2) {
			return numEntero1 + numEntero2;
	}
	
	/**
	 * Método que devuelve un valor númerico real de <i>numReal1</i>, <i>numReal2</i> y <i>numReal3</i>.<br>
	 * 
	 * No se permiten números negativos en los parámetros de entrada.
	 * 
	 * @param numReal1 representa el primer valor númerico real que se sumara.
	 * @param numReal2 representa el segundo valor númerico real que se sumara.
	 * @param numReal3 representa el tercer valor númerico real que se sumara.
	 * 
	 * @return sumarTresReales suma tres números reales entre si, y te devuelve el valor de numReal1,<br>
	 * numReal2 y numReal3.
	 */
	
	public double sumarTresReales(double numReal1, double numReal2, double numReal3) {
			return numReal1 + numReal2 + numReal3;
	}
		
	/**
	 * Método que sirve para sumar el parámetro de entrada al acumulado del método.
	 * 
	 * @param numeroSumaAcumulado representa el valor númerico real
	 * que se quiere sumar al acumulado del atributo de clase <i>sumaAcumulada</i>.
	 */
	
	public static void acumulado(double numeroSumaAcumulado) {
			sumaAcumulada += numeroSumaAcumulado;
	}
		
}
