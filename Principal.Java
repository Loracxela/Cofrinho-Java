package cofrinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("***COFRINHO:***");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");
		
		opcao=teclado.nextInt();
		
		double tipoMoeda;
		double valorAdicionado;
		Moeda md;
		
		while(opcao!=0) {
			
			switch(opcao) {
			
			case 1:
				tipoMoeda=0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("Escolher tipo de Moeda:");
					System.out.println("1-Dolar");
					System.out.println("2-Euro");
					System.out.println("3-Real");
					tipoMoeda = teclado.nextInt();
				}
				System.out.println("Qual valor?:");
				valorAdicionado = teclado.nextDouble();
				md = null;
			
				if(tipoMoeda== 1) {
				        md = new Dolar(valorAdicionado);
				}
				
				if(tipoMoeda== 2) {
				        md = new Euro(valorAdicionado);
				
			    }
			    if(tipoMoeda == 3) {
				        md = new Real(valorAdicionado);
				
			    }
				
				cofrinho.adicionar(md);
				
				break;
				
			case 2:
				tipoMoeda= 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("1-Dolar");
					System.out.println("2-Euro");
					System.out.println("3- Real");
					tipoMoeda = teclado.nextInt();
				}
				System.out.println("Qual valor?");
				valorAdicionado = teclado.nextInt();
				
				md = null;
				if(tipoMoeda == 1) {
					    md = new Dolar(valorAdicionado);
				}
				if(tipoMoeda == 2) {
				        md = new Euro(valorAdicionado);
				}
				if(tipoMoeda == 3) {
				        md = new Real(valorAdicionado);
				    		
				cofrinho.remover(md);
				
				break;
				}
				
			case 3:
				cofrinho.listar();
				break;
				   
			case 4:
				System.out.println("Total convertido para real: R$" + cofrinho.valorConvertido());
				break;
				
			default:	   
			
				System.out.println("Opcao invalida! Tente outra");				
			    }
			
			    System.out.println("Menu");
			    System.out.println("1-Adicionar");
			    System.out.println("2-Remover");
			    System.out.println("3-Listar");
			    System.out.println("4- Total Investido");
			    System.out.println("0-Encerrar");
			    opcao=teclado.nextInt();				
			
		        }
		
		    System.out.println("Sistema Encerrado!");
                }
}