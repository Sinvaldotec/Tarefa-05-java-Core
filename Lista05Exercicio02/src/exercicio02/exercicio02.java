package exercicio02;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir um valor
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Verificando se o número é positivo ou negativo
        if (numero >= 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
        
        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();
    }
}