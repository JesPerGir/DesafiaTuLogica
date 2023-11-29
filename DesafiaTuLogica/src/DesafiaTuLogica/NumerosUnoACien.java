package DesafiaTuLogica;
import java.util.*;

public class NumerosUnoACien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.print("Introduce '2' o '3' para visualizar los números múltiplos de 2 o 3 en el rango entre 1 y 100: ");
			numero = entrada.nextInt();
			
			if(numero != 2 && numero != 3) {
				System.out.println("\n" + "El valor introducido no es válido.\n");
			}
			
		}while(numero != 2 && numero != 3);
		
		
		
		System.out.println("\nLos múltiplos de " + numero + " entre 1 y 100 son:\n");
		
		for(int i=numero;i<=100;i+=numero) {
			
			if(numero==2 && i!=100) {
				System.out.print(i + ", ");
			}
			else if(numero==2 && i==100) {
				System.out.println(i + ".");
				System.out.print("\n" + "Un total de " + (i/numero) + " múltiplos.");
			}
			else if(numero==3 && i!=99) {
				System.out.print(i + ", ");
			}
			else {
				System.out.println(i + ".");
				System.out.print("\n" + "Un total de " + (i/numero) + " múltiplos.");
				
			}
		}
		
		entrada.close();
	}	
}


