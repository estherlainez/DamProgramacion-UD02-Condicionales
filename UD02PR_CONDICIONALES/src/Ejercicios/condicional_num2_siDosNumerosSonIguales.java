package Ejercicios;

import java.util.Scanner;

public class condicional_num2_siDosNumerosSonIguales {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int A;
		int B;
		A=teclado.nextInt();
		B=teclado.nextInt();
	if(A==B)
		System.out.println("Son Iguales");
	else 
		System.out.println("NO Son Iguales");
}
}