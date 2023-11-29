package DesafiaTuLogica;
import java.util.*;
public class AscendenteDescendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0, num2=0, num3=0;
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
		
		if(num1>num2 && num1>num3) {
			mayor=num1;
			
			if(num2>num3) {
				mediano=num2;
				menor=num3;
			}
			else {
				mediano=num3;
				menor=num2;
			}	
		}
		
		if(num2>num3 && num2>num1) {
			mayor=num2;
			
			if(num3>num1) {
				mediano=num3;
				menor=num1;
			}
			else {
				mediano=num1;
				menor=num3;
			}	
		}
		
		if(num3>num2 && num3>num1) {
			mayor=num3;
			
			if(num2>num1) {
				mediano=num2;
				menor=num1;
			}
			else {
				mediano=num1;
				menor=num2;
			}	
		}
		
		do {
			System.out.print("\nIntroduce 'ascendente' o 'descentente' para visualizar los números introducidos en uno u otro orden: ");
			orden = entrada.next();
		}while(orden.equalsIgnoreCase("ascendente")==false && orden.equalsIgnoreCase("descendente")==false);
		
		if(orden.equalsIgnoreCase("ascendente")) {
			System.out.print("\nHas elegido orden ascendente: " + menor + " < " + mediano + " < " + mayor + ".");
		}
		else if(orden.equalsIgnoreCase("descendente")) {
			System.out.print("\nHas elegido orden descendente: " + mayor + " > " + mediano + " > " + menor + ".");
		}
		
		entrada.close();
	}
}
