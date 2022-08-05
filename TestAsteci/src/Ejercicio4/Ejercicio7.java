package Ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
	
	
	public static void main(String[] args) {
		
		
		Random r = new Random();
		
		double numero = r.nextInt(100)+1;
		
		int adiv = 0;
		
		int i = 1;
			while(adiv!=1 && i<=5) {
		    System.out.println();
			System.out.println("Trata de adivinar el número");
			Scanner consola = new Scanner(System.in);
			double a = consola.nextInt();
			adiv = eval(a,numero);
			i++;
			}
			System.out.println();
			System.out.println("Finalizaron los intentos");
		}
	
	
	
	public static int eval(double a, double numero) {
		int adivinado = 0;
			if(a<numero) {
						System.out.println("El número que quieres adivinar es mayor");
					}
					else if(a>numero) {
						System.out.println("El número que quieres adivinar es menor");
					}
					else {
						System.out.println("Acertaste");
						adivinado = 1;
						return adivinado;
						
					}
		    adivinado = 0;
			return adivinado;
	}

}
