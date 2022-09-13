package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int vetor[] = new int[1000];
		int opcao;

		for (int i = 0; i<1000;i++) {
			vetor[i]=(int) (Math.random() * 101);
		}
		for (opcao=1;opcao<3;opcao++) {
			ThreadVetor threadvetor = new ThreadVetor(opcao,vetor);
			threadvetor.start();
		}
	}

}
