package Lista4;

import java.util.Scanner;

public class ex2 {

	private static int vetor[] = new int [8];
	private static int valorX, valorY, somaElem;
	private static Scanner entrada = new Scanner(System.in);

	
	 public static void main(String[] args) {
		 obterDados();
		 somarDados();
	}
	 
	private static void obterDados() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o valor para a " + (i+1) + "ª posição do vetor");
			vetor[i] = entrada.nextInt();
		}
		System.out.println("Informe um número de 1 a 8");
		valorX = entrada.nextInt();
		System.out.println("Informe outro número de 1 a 8");
		valorY = entrada.nextInt();		
	}
	private static void somarDados() {
		somaElem = vetor[valorX] + vetor[valorY];
		System.out.println("A soma dos dois elementos é: "+ somaElem);
	}
}
