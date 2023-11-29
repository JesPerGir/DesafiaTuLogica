package DesafiaTuLogica;

import java.util.*;

public class VeinteSucesivos {
	

	public static void main(String[] args) {
		
		
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			
			System.out.print("Introduce un número: ");
		
			numero = entrada.nextInt();	
			
			System.out.println("Los veinte números sucesivos a " + numero + " son:\n");
			
		}while(numero <0);
		
		
		for(int i=numero+1;i<=numero+20;i++) {
		
			if(i<=numero+19) {
				
				System.out.print(i + ", ");
			}
			
			else{
				
				System.out.print(i + ".");
			}
		}
		
		entrada.close();	
	}
}

