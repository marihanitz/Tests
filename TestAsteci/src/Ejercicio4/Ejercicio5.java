package Ejercicio4;

import java.util.ArrayList;

public class Ejercicio5 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(8);
		numeros.add(5);
		numeros.add(2);
		numeros.add(33);
		numeros.add(54);
		numeros.add(22);
		numeros.add(6);
		numeros.add(88);
		numeros.add(13);
		
		
		
		for (Integer numero : numeros) {
			
			if(numero%2==0) {
				System.out.println(numero);
			}
			
		}
	}
	
}
