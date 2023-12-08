package desafioaula1;

import java.util.Scanner;

public class Desafioaula1 {

	public static void main(String[] args) {
		
		float salario, abono, novosalario;
		Scanner leia = new Scanner(System.in);
			
		System.out.println("Digite seu salário");
		salario = leia.nextFloat();
		
		System.out.print("Digite seu abono");
		abono = leia.nextFloat();
		
		novosalario = (salario + abono);
		 System.out.printf("Seu novo salario é %.2f" , novosalario);
		  }
}
