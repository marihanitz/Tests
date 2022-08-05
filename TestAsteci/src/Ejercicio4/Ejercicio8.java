
package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		System.out.println("Ingresa un primer número");
		Scanner consola = new Scanner(System.in);
		int a = consola.nextInt();
		
		System.out.println("Ingresa un segundo número");
		Scanner consola2 = new Scanner(System.in);
		int b = consola2.nextInt();
		
		System.out.println("Ingresa un tercer número");
		Scanner consola3 = new Scanner(System.in);
		int c = consola3.nextInt();
		
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//Collections.sort(numeros);
	
		//System.out.println(numeros.get(2));
		//System.out.println(numeros.get(1));
		//System.out.println(numeros.get(0));
		
		if(a>b) {
			if(a>c) {
			   if(b>c) {
				   numeros.add(a);
				   numeros.add(b);
				   numeros.add(c);
				  // apos=1;
				   //bpos=2;
				   //cpos=3;
			   }
			   
			   else {
				   numeros.add(a);
				   numeros.add(c);
				   numeros.add(b);
				   //apos=1;
				   //bpos=3;
				   //cpos=2;
			   }
			}
			
			else if (a<c) {
				numeros.add(c);
				numeros.add(a);
				numeros.add(b);
				//apos=2
			    //bpos=3;
			    //cpos=1;
			}
			
		}
		
		else if(a<b) {
			if(a>c) {
				numeros.add(b);
				numeros.add(a);
				numeros.add(c);
				//apos=2;
				//bpos=1
			    //cpos=3;
			}
				
			else if (a<c) {
				
				if(b>c) {
					numeros.add(b);
					numeros.add(c);
					numeros.add(a);
				 // apos=3;
			      //bpos=1;
			      //cpos=2;
			   }
				
				else {
					numeros.add(c);
					numeros.add(b);
					numeros.add(a);
				  // apos=3;
				   //bpos=2;
				   //cpos=1;
				}
			}
		}
		
		
		System.out.println(numeros);
		
	}

}
