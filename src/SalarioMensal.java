/*Criar um programa que calcule a média de salários de uma empresa, 
		 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
		 */
//Desenvolvido por Leticia Verdelho Ribeiro.
import java.util.Scanner;

public class SalarioMensal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		double salarios;
		int funcionarios;

		
		System.out.print("Qual a grade de funcionarios: ");
		funcionarios = scanner.nextInt();
		
		System.out.print("Digite o salario dos funcionarios: ");
		salarios = scanner.nextDouble();
		
		double media = (salarios/funcionarios)/funcionarios;
		
		System.out.println("A Media Salarial de Empresa é: " + media);
		
	}

}
