package Ejercicios;
import java.util.Scanner;
public class condicional_num6_mostrarDosNumeros_oredenadosDecreciente {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int mayor;
		int menor;
		int A;
		int B;
		A=teclado.nextInt();
		B=teclado.nextInt();
	mayor=(A<B)? B : A;
	menor=(A<B)? A : B;
	
	System.out.println( mayor +", " + menor);
	
}
}
