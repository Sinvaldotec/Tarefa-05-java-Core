package exercicio08;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a hora de início do jogo (entre 0 e 23):");
	        int horaInicio = scanner.nextInt();

	        System.out.println("Digite a hora de fim do jogo (entre 0 e 23):");
	        int horaFim = scanner.nextInt();

	        int duracao = calcularDuracao(horaInicio, horaFim);
	        System.out.println("A duração do jogo é de " + duracao + " horas.");
	    }

	    public static int calcularDuracao(int inicio, int fim) {
	        if (inicio <= fim) {
	            return fim - inicio;
	        } else {
	            return (24 - inicio) + fim;
	        }
	    }
	}