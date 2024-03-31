package exercicio05;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o ano atual: ");
	        int anoAtual = scanner.nextInt();

	        System.out.println("Digite o ano de nascimento: ");
	        int anoNascimento = scanner.nextInt();

	        int idade = anoAtual - anoNascimento;

	        if (idade >= 16) {
	            System.out.println("Você poderá votar este ano!");
	        } else {
	            System.out.println("Você não poderá votar este ano.");
	        }

	        scanner.close();
	    }
	}