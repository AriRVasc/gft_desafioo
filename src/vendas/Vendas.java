package vendas;

import java.util.Scanner;

public class Vendas {
	/*Total de Vendas (Vale 3 pontos)
	Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um
	programa que receba código e valor de 5 transações. Calcule e mostre:
	• O valor total das compras à vista
	• O valor total das compras a prazo
	• O valor total das compras efetuadas
	• O valor da soma da primeira prestação das compras a prazo */
	public static void main(String[] args) {
		
	
Scanner scan = new Scanner(System.in);
	 int codigo ;
	 double totalComprasV=0;
	 double totalComprasP=0;

 	for ( int i=0; i<5; i++) {
	System.out.println("Informe 1 para compras a vista e 2 para compras a prazo \n");
	codigo = scan.nextInt();
	if (codigo == 1) {
		
		System.out.println("Informe o valor da compra");
		double compraV = scan.nextDouble();
		
		totalComprasV += compraV;
	} else if (codigo == 2) {
		double compraV =0;
		System.out.println("Informe o valor da compra");
		double compraP = scan.nextDouble();
		
		totalComprasP +=compraP;
		
	
	
}
	double totalComprasE= totalComprasV+totalComprasP;
	
	System.out.println("Total de compras a Vista: "+totalComprasV);
	System.out.println("Total de compras a Prazo: "+totalComprasP);
	System.out.println("Total de compras efetuadas: "+totalComprasE);
 	}
	}
}
