//Desenvolvido por Leticia Verdelho Ribeiro. - Atividade Avaliativa.

import java.util.Scanner;

public class CarroConsumidor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o custo do seu Carro: ");
		double custodoCarro = scanner.nextDouble();
		
		double distribuidor = custodoCarro * 0.28;
        double impostos = custodoCarro * 0.45;
        
        double Custofinal = custodoCarro + distribuidor + impostos;
        
        System.out.println("O custo de Fabricação do carro é: " + Custofinal);
        
        scanner.close();
        
	}

}
