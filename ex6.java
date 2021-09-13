package Lista4;

import java.util.Scanner;

public class ex6 {

	private static Scanner entrada = new Scanner(System.in);
	private static int matriz[][] = new int[3][3];
	private static int somaElem;

	public static void main(String[] args) {
		obterDadosMatriz();
		calcularDados();
	}

	private static void obterDadosMatriz() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe o número");
				matriz[i][j] = entrada.nextInt();
			}
		}

	}

	private static void calcularDados() {
		somaElem = matriz[0][1] + matriz[0][2] + matriz[1][2];
		System.out.print("A soma dos elementos acima da diagonal principal são: " + somaElem);
	}
}
