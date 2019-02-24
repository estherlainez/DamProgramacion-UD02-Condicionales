package Ejercicios;
import java.util.Scanner;
public class condicional_num9_calcularPrecioLapices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca numero de lapices");
		int numerolapices;
		numerolapices=teclado.nextInt();
		double precio;
		
		if (numerolapices>=1000) {
			precio=numerolapices * 0.85;
			System.out.println("El precio sera de "+precio);
			}else if (numerolapices<1000) {
				precio=numerolapices * 0.90;
				System.out.println("El precio sera de "+precio);
				}
	}

}
