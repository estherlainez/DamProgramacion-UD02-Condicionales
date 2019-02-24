package Ejercicios;
import java.util.Scanner;
public class bucles_num13_comprobar_si_es_Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		boolean esprimo= true;    
	    int i;
	    int numero;
		 
	    System.out.print("Ingresa un numero: ");
	    numero =teclado.nextInt();

		 for(i = 2; i < numero; i++)
		 	{	     
		      	if(numero % i == 0 ) 
		      		{
		    	  		esprimo=false; 
		      		}
		     }
		      if(esprimo==true) 
		      		{
		    	  		System.out.println("El numero es primo");
		      		}else{
		      			System.out.println("El numero no es primo");
		      			 }
		   
	}

}
