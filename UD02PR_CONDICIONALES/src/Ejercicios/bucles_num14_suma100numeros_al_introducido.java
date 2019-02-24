package Ejercicios;

import java.util.Scanner;

public class bucles_num14_suma100numeros_al_introducido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int i;
		int numero ;
		numero=teclado.nextInt();
		int suma=0;
		System.out.println("Ingrese numero");
		for(i=numero; i<=numero + 100; i++) {
			
			suma=suma+i;	
		}
		
		System.out.println("la suma es  "+ suma);
	}

}
