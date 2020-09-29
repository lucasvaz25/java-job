package com.senior.avaliacao.qs2;

public class Maiusculo implements IMaiusculo {

	@Override
	public String converteMaiusculo(String par) {
		char[] upCase = par.toCharArray();
		for (int i = 0; i < upCase.length; ++i) {
			if (i == 0 || !Character.isLetterOrDigit(upCase[i - 1])) {
				upCase[i] = Character.toUpperCase(upCase[i]);
			}
		}
		return new String(upCase);
	}

}
