package Ejercicios;
import java.util.Scanner;
public class condicional_num5_leerDecimal_y_verificar_si_esta_enRango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
	    double numero;
	    System.out.println("introduzca un numero decimal");
		numero=teclado.nextDouble();
		
		if (numero<1 &&numero>-1) 
			System.out.println("Numero dentro del rango");
		if (numero>1) System.out.println("Numero es mayor que 1");
		if (numero<-1)System.out.println("Numero es menor que -1");
				
	}

}
