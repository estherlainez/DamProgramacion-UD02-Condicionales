package Ejercicios;
import java.util.Scanner;
public class bucles_num12_deteminar_numerosPositivos_y_Negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner teclado=new Scanner(System.in);
		int i;
		int positivo=0;
		int negativo=0;
		
		for(i=1;i<=10;i++) {
		System.out.println("introduzca numeros");
		 i=teclado.nextInt();
		 
			 if (i>0) {
				 positivo=positivo+1;}
		 	 if (i<0) {
		 	     negativo=negativo+1;};
		
		 }
	 	 
			System.out.println("hay" + positivo+ " numeros positivos y "+ negativo+ " numeros negativos");
			 	
		 /* leer numero
		 * (si numero>0)
		 * positivo ++
		 * si no
		 * negativo++
		 * fin
		 * fin for
		 * 
		 */
	}

}
