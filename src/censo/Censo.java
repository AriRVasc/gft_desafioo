package censo;

import java.util.Scanner;

public class Censo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	/*A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados
	sobre o salário e número de filhos. 
	Faça um procedimento que leia esses dados para um
	número não determinado de pessoas e retorne a média de salário da população, a média do
	número de filhos, o maior salário e o percentual de pessoas com salário até R$350,00.*/
     
        
		double salario =0;
		double salarioTotal=0;
		double mediaSalario=0;
		double salarioMenor=0;
		int qtdFilhos=0;
		int filhosTotal=0;
		int mediaFilhos=0;
		
		int i =0;
        int op=1;
        
        while (op !=0){

        System.out.println("Informe o valor do salario da pessoa "+(i+1));
        salario = scan.nextDouble();
        salarioTotal +=salario;
        
        if (salario < 350.0) {
        	salarioMenor +=salario;
        }

        System.out.println("Informe a quantidade de filhos da pessoa "+(i+1));
        qtdFilhos = scan.nextInt();
        filhosTotal +=qtdFilhos;
        i++;
        
        System.out.println( "Pressione uma tecla para continuar ou 0 para sair");
        op=scan.nextInt();
       
        }

        mediaSalario = (salarioTotal/i);
        System.out.println("A media do salario e " +mediaSalario);
        
        mediaFilhos = (filhosTotal/i);
        System.out.println("A media da quantidade de filhos e " +mediaFilhos);

	
}
	
}
