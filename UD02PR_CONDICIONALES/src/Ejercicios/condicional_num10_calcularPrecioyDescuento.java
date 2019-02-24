package Ejercicios;
import java.util.Scanner;
public class condicional_num10_calcularPrecioyDescuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double preciotraje;
		double descuento=0;
		double preciofinal;
		
		System.out.println("Introduzca el precio");
		preciotraje= teclado.nextDouble();
		
		if (preciotraje>1500) {
			descuento=preciotraje * 0.15;
		}else if (preciotraje<1500) {
				descuento=preciotraje * 0.08;
			}
		
		System.out.println("El descuento sera de " +descuento+" euros");
		preciofinal=preciotraje - descuento;
		System.out.println("El precio del traje sera de "+ preciofinal +" euros");
	}

}
