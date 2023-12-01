package DesafiaTuLogica;
import java.util.*;
public class AscendenteDescendente2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0, num2=0, num3=0, comodin=0;
		int menor=0, mediano=0, mayor=0;
		String orden = "";

		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.print("Introduce el primer número (Un entero positivo): ");
		
			num1 = entrada.nextInt();
			
			if(num1 < 0) {
				System.out.println("\nEse no es un número válido.\n");
			}
		
		}while(num1 <0);
		
		do {
			System.out.print("\nIntroduce el segundo número (Un entero positivo): ");
		
			num2 = entrada.nextInt();
			if(num2 < 0) {
				System.out.println("\nEse no es un número válido.");
			}
			if(num2==num1) {
				System.out.println("\nNo se puede repetir valores.");
			}
		}while(num2 <0 || num2==num1);
		
		do {
			System.out.print("\nIntroduce el tercer número (Un entero positivo): ");
		
			num3 = entrada.nextInt();
			if(num3 < 0) {
				System.out.println("\nEse no es un número válido.");
			}
			if(num3==num2 || num3==num1) {
				System.out.println("\nNo se puede repetir valores.");
			}
		}while(num3 <0 || num3==num2 || num3==num1);
		
			do {
				
			comodin = num1;
			num1 = num2;
			num2 = comodin;
			
			}while(num1<num2);
			
			do {
			comodin = num2;
			num2 = num3;
			num3 = comodin;
			
		}while(num2<num3);
		
		do {
			System.out.print("\nIntroduce 'ascendente' o 'descentente' para visualizar los números introducidos en uno u otro orden: ");
			orden = entrada.next();
		}while(orden.equalsIgnoreCase("ascendente")==false && orden.equalsIgnoreCase("descendente")==false);
		
		if(orden.equalsIgnoreCase("ascendente")) {
			System.out.print("\nHas elegido orden ascendente: " + num3 + " < " + num2 + " < " + num1 + ".");
		}
		else if(orden.equalsIgnoreCase("descendente")) {
			System.out.print("\nHas elegido orden descendente: " + num1 + " > " + num2 + " > " + num3 + ".");
		}
		
		entrada.close();
	}
}
