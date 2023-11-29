package DesafiaTuLogica;

public class NumerosDiezAlUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 10;
		
		System.out.println("Números del 10 al 1 en orden descendente: \n");
		
		while(numero > 1){
			
			System.out.print(numero + ", ");	
				
			numero--;
			
			if (numero == 1){
				
				System.out.print(numero + ".");
			}
		}
	}
}
