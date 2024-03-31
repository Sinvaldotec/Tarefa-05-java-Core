package exercicio10;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Ler o salário fixo do vendedor
	        System.out.print("Informe o salário fixo do vendedor: ");
	        double salarioFixo = scanner.nextDouble();

	        // Ler o valor das vendas efetuadas pelo vendedor
	        System.out.print("Informe o valor das vendas efetuadas pelo vendedor: ");
	        double valorVendas = scanner.nextDouble();

	        // Calcular a comissão
	        double comissao;
	        if (valorVendas <= 1500) {
	            comissao = valorVendas * 0.03;
	        } else {
	            comissao = (1500 * 0.03) + ((valorVendas - 1500) * 0.05);
	        }

	        // Calcular o salário total
	        double salarioTotal = salarioFixo + comissao;

	        // Exibir o resultado
	        System.out.println("O salário total do vendedor é: R$ " + salarioTotal);

	        scanner.close();
	    }
	}