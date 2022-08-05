package Ejercicio4;

import java.util.ArrayList;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> paises = new ArrayList<String>();
		
		paises.add("Rusia");
		paises.add("Estados Unidos");
		paises.add("Brasil");
		paises.add("Canada");
		paises.add("Mexico");
		
		
		ArrayList <String> Paises = new ArrayList<String>();
		
		for (String pais : paises) {
			char u = pais.charAt(pais.length()-1);
			
			if(u=='a'|| u=='e' || u=='i' || u=='o' || u=='u') {
				String Pais = pais.replace(pais.charAt(pais.length()-1),pais.toUpperCase().charAt(pais.length()-1));
				Paises.add(Pais);
			}
		}
		
		System.out.println(Paises);
		
	}

}
