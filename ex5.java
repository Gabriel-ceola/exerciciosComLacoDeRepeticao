package Lista4;

import java.util.Scanner;

public class ex5 {

	private static int matriz[][] = new int[4][4];
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		obterDados();
		mostrarDados();
	}

	private static void obterDados() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Informe os números que vão compor a matriz");
				matriz[i][j] = entrada.nextInt();
				
			}
		}

	}

	private static void mostrarDados() {
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
	}

}
