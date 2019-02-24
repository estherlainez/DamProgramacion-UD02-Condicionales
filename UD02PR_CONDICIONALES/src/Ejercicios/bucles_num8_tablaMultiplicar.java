package Ejercicios;
import java.util.Scanner;
public class bucles_num8_tablaMultiplicar {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int tabla; 
		tabla=teclado.nextInt();
		for(int i=0; i<=10; i++) {
			System.out.println(tabla + "*" + i + "=" + tabla *i);
		}
		
	

		
	}
	
}
