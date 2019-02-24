package Ejercicios;
import java.util.Scanner;
public class condicional_num7_notas_y_laMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double nota1;
		double nota2;
		double nota3;
		double notamedia;
		int notafinal;
		nota1=teclado.nextDouble();
		nota2=teclado.nextDouble();
		nota3=teclado.nextDouble();
		notamedia=(nota1 + nota2 + nota3) / 3;
		System.out.println("la nota media es de"+notamedia);
		notafinal=(int)notamedia;
		System.out.println("nota final" + notafinal);
		if 
		(notafinal <5) {
			System.out.println("calificacion es insuficiente");
		}
		if
		(notafinal ==5) {
			System.out.println("calificacion es suficiente");
			}
		if(notafinal ==6) {
			System.out.println("calificacion es bien");
		}
		if
		(notafinal>7 && notafinal<8) {
			System.out.println("calificacion es notable");
		}
		if
		(notafinal>=9) {
			System.out.println("calificacion es sobresaliente");
		}
		else {
			//System.out.println("consulte mas informacion");
		}
		
	}

}
