package desafioaula1;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
			float salarioBruto, adcionalNoturno, horasExtras, desconto, salarioLiquido;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o Salário Bruto");
			salarioBruto = leia.nextFloat();
			
			System.out.println("Digite o seu Adcional Noturno");
			adcionalNoturno = leia.nextFloat();
			
			System.out.println("Digite as suas Horas Extras");
			horasExtras = leia.nextFloat();
			
			System.out.println("Digite o seu Desconto");
			desconto = leia.nextFloat();
			
			salarioLiquido = (salarioBruto + adcionalNoturno + (horasExtras * 5) - desconto);
			System.out.println("Seu salário Liquido é " + salarioLiquido);
			

	}

}
