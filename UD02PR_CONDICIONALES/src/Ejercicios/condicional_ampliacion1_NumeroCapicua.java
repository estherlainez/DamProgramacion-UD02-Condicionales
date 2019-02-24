package Ejercicios;
import java.util.Scanner;
public class condicional_ampliacion1_NumeroCapicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		int numero;
		numero=teclado.nextInt();
		System.out.println("introduzca un numero de 4 digitos");
		
		int unidades=numero%10;
		int decenas=numero/10;
		int centenas=numero/100;
		int millar=numero/1000;
		
		if(numero<1000 && numero>=100 && unidades==centenas) {
			System.out.print("Numero capicua");
		}else {
			if(numero>=1000 && decenas==centenas && unidades==millar) {
				System.out.println("Numero capicua");
			}else {
				if(numero<100 && decenas==unidades) {
					System.out.println("Numero  capicua");
				}else {
						System.out.println("numero no capicua");
					}
				}
			}
		}
	}



