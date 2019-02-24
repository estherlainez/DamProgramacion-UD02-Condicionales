package Ejercicios;
import java.util.Scanner;
public class bucles_num7_accesoCajaFuerte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int intentos=0;
		boolean acertado=false;
		int numero;
		numero=teclado.nextInt();
		int clave=1234;
		
		do {
			if (numero==clave) {
				System.out.println("hemos acertado");
				numero=teclado.nextInt();
			}else {System.out.println("clave erronea");
					intentos=intentos+1;
					numero=teclado.nextInt();
					}
		   }
		while(intentos<4 && acertado==false);
		
	/*leer(numero)
	 * do{
	 * if (numero==clave)
	 * System.out.println("Hemos acertado");
	 * else
	 * System.out.println("clave erronea");
	 * intentos=intentos+1
	 * }
	 * while(intentos<4)&&acertado=false	
	 */
		
		
		
		
		
		
		
		
		
		
	}

}
