// 2. Faça um Programa que pergunte ao usuário um valor em metros e
// converta o valor digitado para centímetros.

package prog_exercicios;


import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor em metros: ");
		int numero = input.nextInt();
		
		int n = numero * 100;
		
		System.out.printf("O valor em centimetro é igual a: %s", n);
		
	
		

	}

}
