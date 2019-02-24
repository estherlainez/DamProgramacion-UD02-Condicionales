package Ejercicios;
import java.util.Scanner;
public class condicional_num3_Cual_es_elMayor_deDosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int valor1;
		int valor2;
		valor1=teclado.nextInt();
		valor2=teclado.nextInt();
		if(valor1>valor2)
			System.out.println("valor1 es mayor que valor2");
		else 
			System.out.println("valor2 es mayor que valor1");
	}

}
