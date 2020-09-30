package com.senior.avaliacao.qs3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ValidaProtocolo prot = new ValidaProtocolo();
		String protocolo;

		System.out.println("Informe o protocolo: ");
		protocolo = sc.nextLine();

		prot.setProtocolo(protocolo);

		if (prot.validaProtocolo(prot.getProtocolo())) {
			System.out.println("Protocolo v�lido!");
		} else
			System.out.println("Protocolo inv�lido!");
		sc.close();
	}

}
