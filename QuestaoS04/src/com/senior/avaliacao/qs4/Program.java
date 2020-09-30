package com.senior.avaliacao.qs4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IConversor conv = new Conversor();
		System.out.println("Insira um valor: ");
		int num = sc.nextInt();
		String Vlr = conv.converteBase5(num);
		System.out.println();
		System.out.printf("Valor Decimal: %d | Valor Base5: %s", num, Vlr);
		sc.close();

	}

}
