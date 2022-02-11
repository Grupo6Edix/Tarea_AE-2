package calculadora;

import calculadora.Cociente;
import calculadora.Resta;
import calculadora.Suma;

public class Principal {

	public static void main(String[] args) {
				
		System.out.println("Métodos clase Cociente:" + "\n");
		
		if(Cociente.divisionReal(5.67, 0) == -1.0)
			System.out.println("ERROR - Introducido número negativo");
			else if(Cociente.divisionReal(5.67, 0) == -2.0)
				System.out.println("ERROR - Introducido valor 0 en divisor");
				else
					System.out.println(Cociente.divisionReal(5.67, 0));
		
		if(Cociente.divisionEntera(8, 9) == -1.0)
			System.out.println("ERROR - Introducido número negativo");
			else if(Cociente.divisionEntera(8, 9) == -2.0)
				System.out.println("ERROR - Introducido valor 0 en divisor");
				else
					System.out.println(Cociente.divisionEntera(8, 9));
		
		if(Cociente.inverso(-6) == -1.0)
			System.out.println("ERROR - Introducido número negativo");
			else
				System.out.println(Cociente.inverso(-6));
		
		if(Cociente.raiz(7) == -1.0)
			System.out.println("ERROR - Introducido número negativo");
			else
				System.out.println(Cociente.raiz(7) + "\n");
	
		System.out.println("Métodos clase Resta:" + "\n");
		
		if(Resta.restaReal(5.24, 3.21) == -1.0)
			System.out.println("ERROR - Introducido número negativo");
			else
				System.out.println(Resta.restaReal(5.24, 3.21));
		
		if(Resta.restaEntera(-8, 3) == -1.0)
			System.out.println("ERROR - Introducido número negativo");
			else
				System.out.println(Resta.restaEntera(-8, 3));
		
		if(Resta.restaRealTriple(5.21, 2.16, 1.33) == -1.0)
			System.out.println("ERROR - Introducido número negativo");
			else
				System.out.println(Resta.restaRealTriple(5.21, 2.16, 1.33));
	
		Resta.acumulado(-5);
		Resta.acumulado(5);
		System.out.println(Resta.getRestaAcumulada() + "\n");
		
		
		System.out.println("Métodos clase Suma:" + "\n");
		
		if(Suma.sumarDosReales(7.84, 3.21) == -1.0)
			System.out.println("ERROR - Introducido número negativo");
			else
				System.out.println(Suma.sumarDosReales(7.84, 3.21));
		
		if(Suma.sumarDosEnteros(-7, 4) == -1.0)
			System.out.println("ERROR - Introducido número negativo");
			else
				System.out.println(Suma.sumarDosEnteros(-7, 4));
		
		if(Suma.sumarTresReales(0.21, 4.16, 1.33) == -1.0)
			System.out.println("ERROR - Introducido número negativo");
			else
				System.out.println(Suma.sumarTresReales(0.21, 4.16, 1.33));
	
		Suma.acumulado(-2);
		Suma.acumulado(2);
		System.out.println(Suma.getSumaAcumulada() + "\n");
			
			
	}

}
