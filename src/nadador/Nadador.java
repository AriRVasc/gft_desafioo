package nadador;

import java.util.Scanner;

public class Nadador {
	/* Faça um procedimento que recebe a idade de um nadador e retorna a categoria desse
	nadador de acordo com a tabela abaixo: */ 
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a idade do nadador:\n");
		int idade = scan.nextInt();
		
		

		
		if ( idade<= 7 && idade>=5  ) {
			System.out.println("Infantil A");
			
		} else if ( idade<= 8 && idade>=10  ) {
			System.out.println("Infantil B");
			
		}else if ( idade<= 11 && idade>=13  ) {
			System.out.println("Juvenil A");
			
		}else if ( idade<= 14 && idade>=17  ) {
			System.out.println("Juvenil  B");
			
		} else System.out.println("Adulto");
		
	}
	}
