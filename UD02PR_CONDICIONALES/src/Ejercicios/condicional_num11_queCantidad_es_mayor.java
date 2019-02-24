package Ejercicios;
import java.util.Scanner;
public class condicional_num11_queCantidad_es_mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca tres numeros");
		int A;
		int B;
		int C;
		A=teclado.nextInt();
		B=teclado.nextInt();
		C=teclado.nextInt();
		
		if (A<B && C<B) {
			System.out.print(B);
			}else if (A<C && B<C) {
				System.out.print(C);
			  }else if (B<A && C<A) {
				  System.out.print(A);
					}
	
		}
		
	}
