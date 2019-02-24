package Ejercicios;
import java.util.Scanner;
public class condicional_ampliacion2_mostrarHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca hora minutos y segundos");
		int hora;
		int minutos; 
		int segundos;
		hora=teclado.nextInt();
		minutos=teclado.nextInt();
		segundos=teclado.nextInt();
		
		segundos=segundos+1;
		if(segundos>59) {
			segundos=0;
			minutos=minutos+1;
		}
		if(minutos>59) {
			minutos=0;
			hora=hora+1;
		}
		if (hora>23 && minutos>59) {
			hora=0;
		}
		
		System.out.println("son las "+hora +" y "+ minutos+" y " + segundos);
	}

}
