package exercicio05;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite a nota da 1ª avaliação:");
	        double nota1 = scanner.nextDouble();
	        
	        System.out.println("Digite a nota da 2ª avaliação:");
	        double nota2 = scanner.nextDouble();
	        
	        double media = calcularMedia(nota1, nota2);
	        
	        System.out.println("A média do aluno é: " + media);
	        
	        if (media >= 6) {
	            System.out.println("Aluno aprovado!");
	        } else {
	            System.out.println("Aluno reprovado.");
	        }
	        
	        scanner.close();
	    }
	    
	    public static double calcularMedia(double nota1, double nota2) {
	        return (nota1 + nota2) / 2;
	    }
	}