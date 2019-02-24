package Ejercicios;
import java.util.Scanner;
public class condicional_num8_ComprobarFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int dia;
		int mes ;
		int año;
		dia=teclado.nextInt();
		mes=teclado.nextInt();
		año=teclado.nextInt();
		
		if
		(mes==1 && dia<=31) {
			System.out.println("Enero");
		} else if(mes==2 && dia<=28) {
			System.out.println("Febrero");
		}else if(mes==3 && dia<=31) {
			System.out.println("Marzo");
	    }else if(mes==4 && dia<=30) {
			System.out.println("Abril");
	    }else if(mes==5 && dia<=31) {
			System.out.println("Mayo");
	    }else if(mes==6 && dia<=30) {
			System.out.println("Junio");
	    }else if(mes==7 && dia<=31) {
			System.out.println("Julio");
	    }else if(mes==8 && dia<=31) {
			System.out.println("Agosto");
	    }else if(mes==9 && dia<=30) {
	    	System.out.println("Septiembre");
	    }else if(mes==10 && dia<=31) {
	    	System.out.println("Octubre");
	    }else if(mes==11 && dia<=30) {
	    	System.out.println("Noviembre");
	    }else if
		(mes==12 && dia<=31) {
	    	System.out.println("Diciembre");
	    }else {
	    	System.out.println("Fecha Incorrecta");
	    	}
		
	}

}
