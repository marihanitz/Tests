package Ejercicio4;

import java.util.ArrayList;

public class Ejercicio2 {

	
	
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("juan");
		lista.add("pedro");
		lista.add("jose");
		lista.add("maria");
		lista.add("sofia");
		System.out.println(lista);
		
		
		ArrayList<String> Lista = new ArrayList<String>();
		
		for (String nombre : lista) {
			char a = nombre.toUpperCase().charAt(0);
			String Nombre = nombre.replace(nombre.charAt(0),a);
			Lista.add(Nombre);
		}
		
		for (String Nombre : Lista) {
			System.out.println(Nombre);
		}
		
		
	}
	
}
