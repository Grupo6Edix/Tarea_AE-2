package calculadora;

public class Principal {

	public static void main(String[] args) {
		
		Cociente coc1 = new Cociente();
		
		System.out.println("Métodos clase Cociente:");
		
		System.out.println(coc1.divisionReal(5.67, 2.01));
		System.out.println(coc1.divisionEntera(5, 2));
		System.out.println(coc1.inverso(6));
		System.out.println(coc1.raiz(7) + "\n");
		
		Resta res1 = new Resta();
		
		System.out.println("Métodos clase Resta:");
		
		System.out.println(res1.restaReal(5.24, 3.21));
		System.out.println(res1.restaEntera(8, 3));
		System.out.println(res1.restaRealTriple(5.21, 2.16, 1.33));
		res1.acumulado(5);
		res1.acumulado(5);
		System.out.println(res1.getRestaAcumulada() + "\n");
		
	}

}
