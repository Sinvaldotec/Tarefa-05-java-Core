package exercicio07;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Solicita ao usuário que insira os dois valores
	        System.out.println("Digite o primeiro valor:");
	        double valor1 = scanner.nextDouble();

	        System.out.println("Digite o segundo valor:");
	        double valor2 = scanner.nextDouble();

	        // Verifica se os valores são diferentes
	        if (valor1 == valor2) {
	            System.out.println("Os valores inseridos são iguais. Por favor, insira valores diferentes.");
	            return;
	        }

	        // Determina qual valor é menor
	        double menor, maior;
	        if (valor1 < valor2) {
	            menor = valor1;
	            maior = valor2;
	        } else {
	            menor = valor2;
	            maior = valor1;
	        }

	        // Escreve os valores em ordem crescente
	        System.out.println("Os valores em ordem crescente são:");
	        System.out.println(menor);
	        System.out.println(maior);

	        scanner.close();
	    }
	}