package exercicio11;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Leitura dos dados da conta
	        System.out.print("Número da conta do cliente: ");
	        int numeroConta = scanner.nextInt();
	        
	        System.out.print("Saldo: ");
	        double saldo = scanner.nextDouble();
	        
	        System.out.print("Débito: ");
	        double debito = scanner.nextDouble();
	        
	        System.out.print("Crédito: ");
	        double credito = scanner.nextDouble();
	        
	        // Cálculo do saldo atual
	        double saldoAtual = saldo - debito + credito;
	        
	        // Verificação do saldo
	        if (saldoAtual >= 0) {
	            System.out.println("Saldo Positivo");
	        } else {
	            System.out.println("Saldo Negativo");
	        }
	        
	        // Exibição do saldo atual
	        System.out.println("Saldo atual: " + saldoAtual);
	        
	        scanner.close();
	    }
	}