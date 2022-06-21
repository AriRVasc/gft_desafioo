package concessionaria;

import java.util.Scanner;

public class Concessionaria {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do carro: ");
		Double valorDoCarro = Double.valueOf(scanner.nextLine());
		
		scanner.close();
		
		Double precoAVista = valorDoCarro * 0.8;
		Double precoTotalTresParcelas = calculaValorTotalParcelado(valorDoCarro, 3);
		Double precoTotalSeisParcelas = calculaValorTotalParcelado(valorDoCarro, 6);
		Double precoTotalNoveParcelas = calculaValorTotalParcelado(valorDoCarro, 9);
		
		
        System.out.printf("%15s %20s %20s \n", "PREÇO FINAL", "QUANT DE PARCELAS", "VALOR DA PARCELA");
        
        System.out.printf("%15.2f %20s %20.2f \n", precoAVista, "A VISTA (1)", precoAVista);
        System.out.printf("%15.2f %20s %20.2f \n", precoTotalTresParcelas, "3", precoTotalTresParcelas/3);
        System.out.printf("%15.2f %20s %20.2f \n", precoTotalSeisParcelas, "6", precoTotalSeisParcelas/6);
        System.out.printf("%15.2f %20s %20.2f \n", precoTotalNoveParcelas, "9", precoTotalNoveParcelas/9);
        
		

	}
	
	public static Double calculaValorTotalParcelado (Double valorDoCarro, int numeroDeParcelas) {
		return valorDoCarro + (valorDoCarro * 0.01 * numeroDeParcelas);
	}

}