package Ejercicios;
import java.util.Scanner;
public class bucles_num11_numero_cuadrado_y_cubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int i;
		
		for(i=1; i < i+5; i++) { 
			System.out.println("Introduzca numero");
			i=teclado.nextInt();
			System.out.println("La i vale" + i);
			System.out.println("\t" +i +"\t"+ i*i+"\t"+i*i*i);	
		}
		
		
	}

}
