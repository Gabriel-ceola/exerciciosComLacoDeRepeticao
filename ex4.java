package Lista4;

import java.util.Scanner;

public class ex4 {

	private static Scanner entrada = new Scanner(System.in);
	private static int vetor[] = new int[5];
	private static int opcao;

	public static void main(String[] args) {
		obterDados();
		mostrarDados();
	}

	private static void obterDados() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Adicione os números ao vetor");
			vetor[i] = entrada.nextInt();
		}
		System.out.println(
				"Insira a opção de saida: \r\n Opção 1: mostrar o vetor na ordem em que foi escrito \r\n Opção 2: mostrar o vetor na ordem inversa em que foi escrito");
		opcao = entrada.nextInt();
	}

	private static void mostrarDados() {
		if (opcao == 1) {
			for (int i = 0; i < vetor.length; i++)
				System.out.println(vetor[i]);
		} else {
			for (int i = vetor.length - 1; i >= 0; i--) {
				System.out.println(vetor[i]);
			}
		}

	}

}
