package Ejercicios;
import java.util.Scanner;
public class bucles_num10_mediaNumerosPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero = 0;
		int contador=0;
		int suma=0;
		
		while(numero>=0) {
			numero=teclado.nextInt();
			contador=contador+1;
			
			suma=suma+numero;
		}
		
		float media=(suma-numero)/(contador -1);
		System.out.println("La suma es " + suma);
		System.out.println("La media es " + media);
	}

}
