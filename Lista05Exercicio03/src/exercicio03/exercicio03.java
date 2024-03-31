package exercicio03;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário o número de maçãs compradas
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidadeMacas = scanner.nextInt();

        // Calcular o custo total da compra
        double custoTotal;
        if (quantidadeMacas < 12) {
            custoTotal = quantidadeMacas * 1.30; // R$ 1,30 por maçã
        } else {
            custoTotal = quantidadeMacas * 1.00; // R$ 1,00 por maçã
        }

        // Exibir o custo total da compra
        System.out.println("O custo total da compra é: R$ " + custoTotal);

        scanner.close();
    }
}
