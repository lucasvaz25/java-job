package com.senior.avaliacao.qs2;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IMaiusculo Str = new Maiusculo();
		System.out.println("Insira uma frase:");
		String frase = sc.nextLine();
		System.out.println();
		System.out.println("Frase alterada: " + Str.converteMaiusculo(frase));
		sc.close();
	}
}
