package com.senior.avaliacao.qs5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ILimpa lim = new Limpa();
		System.out.println("Insira uma frase: ");
		String frase = sc.nextLine();
		System.out.println("Insira a palavra chave que deseja remover da frase: ");
		String rem = sc.nextLine();
		System.out.println();
		String result = lim.limpar(frase, rem);
		System.out.println("Frase formatada: " + result);
		sc.close();
	}

}
