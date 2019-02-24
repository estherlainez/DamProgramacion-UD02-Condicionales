package Ejercicios;
import java.util.Scanner;
public class condicional_num1_par_impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int numero;
		int resultado;
		numero=teclado.nextInt();
		resultado=numero % 2;
	if (resultado==0) {
			System.out.println(numero+ "es par");
	} else {
		System.out.println(numero+ "es impar");
	}

}
}