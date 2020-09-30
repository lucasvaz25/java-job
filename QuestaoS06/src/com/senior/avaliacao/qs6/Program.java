package com.senior.avaliacao.qs6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ISubstitui sub = new Substitui();
		System.out.println("Insira uma frase: ");
		String frase = sc.nextLine();
		System.out.println("Insira a palavra chave que deseja remover da frase: ");
		String rem = sc.nextLine();
		System.out.println();
		System.out.println("Insira a nova palavra da frase: ");
		String nov = sc.nextLine();
		String result = sub.substituir(frase, rem, nov);
		System.out.println("Frase formatada: " + result);
		sc.close();
	}

}
