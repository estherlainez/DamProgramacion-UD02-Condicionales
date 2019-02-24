package Ejemplos;

public class EJ04_bucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarar un for(inicializacion; condicion; incremento)
		for(int i=1;i<11; i++) {
			System.out.println("El valor de la variable es: "+i);
		}
		System.out.println("\n\n");
		for(int i=1;i<11; i+=3) {
			System.out.println("El valor de la variable es: "+i);
		}
		
		System.out.println("\n\n");
		for(int i=1;i<11; i-=3) {
			System.out.println("El valor de la variable es: "+i);
		}
		
		System.out.println("\n\n");
		for(int i=1;i<11; i+=2) {
			System.out.println("El valor de la variable es: "+i);
		}
	}

}
