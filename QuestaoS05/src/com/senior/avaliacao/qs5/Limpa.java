package com.senior.avaliacao.qs5;

public class Limpa implements ILimpa {

	@Override
	public String limpar(String string, String substring) {
		String str = "";
		StringBuilder s = new StringBuilder();
		StringBuilder st = new StringBuilder();
		st.append(string);
		int tam = string.length();
		int tamS = substring.length();

		for (int i = 0; i < tam; i++) {

			for (int k = i; k < (tamS + i); k++) {
				if (k == tam) {
					continue;
				}
				s.append(string.charAt(k));

			}
			String comp = s.toString();
			if (comp.equals(substring)) {
				for (int q = 0; q < tamS; q++) {
				st.deleteCharAt(i);
				
				}
				tam = st.length();
				string = st.toString();
				i = 0;
			}
			s = new StringBuilder();
		}
		str = st.toString();
		return str;
	}

}
