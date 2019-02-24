package Ejercicios;
import java.util.Scanner;
public class condicional_num4_Comprobar_yMostrar_el_Mayor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int A;
		int B;
		A=teclado.nextInt();
		B=teclado.nextInt();
		if(A==B) System.out.println("Valores Iguales");
		if(A>B)System.out.println("A es mayor que B");
		if(A<B) System.out.println("B es mayor que A");

}
}