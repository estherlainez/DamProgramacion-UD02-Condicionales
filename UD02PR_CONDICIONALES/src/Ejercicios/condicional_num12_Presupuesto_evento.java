package Ejercicios;
import java.util.Scanner;
public class condicional_num12_Presupuesto_evento {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	
	Scanner teclado = new Scanner (System.in);
	System.out.println("Introduzca numero de personas");
	int numpersonas;
	int presupuesto;
	numpersonas=teclado.nextInt();
	if (numpersonas < 200) {
		presupuesto=numpersonas * 95;
		}else if(numpersonas>200 && numpersonas<300) {
			presupuesto=numpersonas * 85;
			}else {
				presupuesto=numpersonas * 75; }

	
	System.out.println("Su precio asciende a "+ presupuesto +"  euros");
	
	
	
	
	}	

}

