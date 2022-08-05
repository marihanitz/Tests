package Ejercicio4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner consola = new Scanner (System.in);
       System.out.println("Ingresa un número");
       int n = consola.nextInt();
       
       int cont = 1;
       
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=i;j++) {
	           System.out.print(cont+" ");
	           cont++;
    	       }
    	   System.out.println();
    	   
       }
	}

}