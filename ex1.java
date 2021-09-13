package lista4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class exercicio1 {

	private static int vetor[] = new int[10];
	private static int vetor2[] = new int[10];
	static int vetor3;
	static int cont = 0;
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		ObterDados();
		compararDados();
	}

	private static void ObterDados() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe numeros");
			vetor[i] = entrada.nextInt();

		}
		for (int j = 0; j < vetor2.length; j++) {
			System.out.println("Informe outros numeros");
			vetor2[j] = entrada.nextInt();

		}

	}

	private static void compararDados() {

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor2.length; j++) {
				if (vetor[i] == vetor2[j]) {
					vetor3 = vetor[i];
					cont++;
					System.out.println("Números iguais: " + vetor3);
				}

			}
		}

	}

}
