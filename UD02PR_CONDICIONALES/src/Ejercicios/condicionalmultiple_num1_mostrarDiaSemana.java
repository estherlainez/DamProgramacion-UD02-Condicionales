package Ejercicios;

import java.util.Scanner;

public class condicionalmultiple_num1_mostrarDiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner teclado= new Scanner (System.in);
		
		System.out.println("Introduce numero de dia de la" 
		+"semana que quieres visualizar");
		
		int diaSemana; 
		diaSemana=teclado.nextInt();
		String dia;
		switch(diaSemana) {
			case 1:
				dia= "Lunes";
				break;
			case 2:
				dia= "Martes";
				break;
			case 3:
				dia="Miercoles";
				break;
			case 4:
				dia= "Jueves";
				break;
			case 5:
				dia= "Viernes";
				break;
			case 6:
				dia= "Sabado";
				break;
			case 7:
				dia= "Domingo";
				break;
			default:
				dia="Error: El numero no es valido";
		}
		System.out.println("El dia es "+ dia);
	}

}
