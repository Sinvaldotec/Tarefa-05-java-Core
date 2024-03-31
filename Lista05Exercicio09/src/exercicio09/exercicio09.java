package exercicio09;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        double salarioTotal = calcularSalarioTotal(horasTrabalhadas, salarioPorHora);

        System.out.println("O salário total do funcionário é: R$" + salarioTotal);

        scanner.close();
    }

    public static double calcularSalarioTotal(double horasTrabalhadas, double salarioPorHora) {
        double horasNormais = Math.min(horasTrabalhadas, 160); // 4 semanas * 40 horas
        double horasExtras = Math.max(horasTrabalhadas - 160, 0); // Horas trabalhadas além das 160 horas normais
        double salarioTotal = horasNormais * salarioPorHora + horasExtras * salarioPorHora * 1.5;
        return salarioTotal;
    }
}