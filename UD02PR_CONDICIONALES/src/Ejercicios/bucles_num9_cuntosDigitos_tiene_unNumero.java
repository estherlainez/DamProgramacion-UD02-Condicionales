package Ejercicios;
import java.util.Scanner;
public class bucles_num9_cuntosDigitos_tiene_unNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num;
		int contador=0;
		
		System.out.println("Introduce numero");
		num=teclado.nextInt();
		while(num!=0)
		{
		num=num/10;
		contador++;
		
		}	
	
		System.out.println("El numero de cifras es "+ contador);
	}

}
