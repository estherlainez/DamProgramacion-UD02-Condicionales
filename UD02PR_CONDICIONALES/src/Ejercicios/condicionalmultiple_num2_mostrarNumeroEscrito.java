package Ejercicios;
import java.util.Scanner;
public class condicionalmultiple_num2_mostrarNumeroEscrito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
	
		System.out.println("Introduzca número del 1 al 99");
		int numero;
		numero= teclado.nextInt();
		while(numero<1 || numero>99) {
			System.out.println("El numero no esta en el rango correcto vuelva a intentarlo");
			numero=teclado.nextInt();
		}
		
		
		if ((numero>=10 && numero<=15)||(numero==20))//caso especial
			switch (numero) {
			case 10: System.out.println("diez");
					break;
			case 11: System.out.println("once");
					break;
			case 12: System.out.println("doce");
					break;
			case 13: System.out.println("trece");
					break;	
			case 14: System.out.println("catorce");
					break;	
			case 15: System.out.println("quince");
					break;
			}else {
				int unidades=numero % 10;
				int decenas=numero / 10;
		
				switch(decenas) { 
				case 0:
					System.out.println("  ");
					break;
				case 1:
					System.out.println("dieci" );
					break;
				case 2:
					System.out.println("venti");
					break;
				case 3:
					System.out.println("treinta");
					break;
				case 4:
					System.out.println("cuarente");
					break;
				case 5:
					System.out.println("cincuenta");
					break;
				case 6:
					System.out.println("sesenta");
					break;
				case 7:
					System.out.println("setenta");
					break;
				case 8:
					System.out.println("ochenta");
					break;
				case 9:
					System.out.println("noventa");
					break;
				}
			if (decenas !=0 && decenas !=1 && unidades!=0 && decenas!=2) {
				System.out.println("y");
				switch(unidades) {
		
				case 1:
					System.out.println("uno");
					break;
				case 2:
					System.out.println("dos");
					break;
				case 3:
					System.out.println("tres");
					break;
				case 4:
					System.out.println("cuatro");
					break;
				case 5:
					System.out.println("cinco");
					break;
				case 6:
					System.out.println("seis");
					break;
				case 7:
					System.out.println("siete");
					break;
				case 8:
					System.out.println("ocho");
					break;
				case 9:
					System.out.println("nueve");
					break;
				}
			}	
			}
	}	
		
}


