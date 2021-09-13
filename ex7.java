package Lista4;

import java.util.Random;

public class ex7 {

		private static Random random = new Random();
		private static int matriz[][] = new int[5][5];
		
		public static void main(String[] args) {
			obterDadosMatriz();
			exibirDadosMatriz();
		}


		private static void obterDadosMatriz() {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j] = random.nextInt(99);
				}
			}
		}
		private static void exibirDadosMatriz() {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

