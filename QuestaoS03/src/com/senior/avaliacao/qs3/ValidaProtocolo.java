package com.senior.avaliacao.qs3;

public class ValidaProtocolo implements IValidaProtocolo {
	private String protocolo;

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	@Override
	public boolean validaProtocolo(String protocolo) {

		int i = protocolo.length();
		char digFirst = protocolo.charAt(i - 2);
		char digSec = protocolo.charAt(i - 1);
		StringBuilder str = new StringBuilder();

		str.append(digFirst);
		str.append(digSec);
		String dig = str.toString();

		int vlrFirst, vlrSec, v;

		vlrFirst = 0;
		vlrSec = 0;
		v = 2;
		str = new StringBuilder();

		for (int k = (i - 3); k > 0; k--) {
			str.append(protocolo.charAt(k));
			String s = str.toString();
			vlrFirst += (Integer.valueOf(s).intValue() * v++);
			str = new StringBuilder();
		}

		int value1 = (vlrFirst * 10);
		char resFirst = Character.forDigit((value1 % 11), 10);
		v = 2;

		for (int j = (i - 2); j > 0; j--) {
			str.append(protocolo.charAt(j));
			String s1 = str.toString();
			vlrSec += (Integer.valueOf(s1).intValue() * v++);
			str = new StringBuilder();
		}

		int value2 = (vlrSec * 10);
		char resSec = Character.forDigit((value2 % 11), 10);

		str = new StringBuilder();
		str.append(resFirst);
		str.append(resSec);
		String res = str.toString();

		if (res.equals(dig)) {
			return true;

		} else
			return false;
	}

}
