package com.senior.avaliacao.qs6;

public class Substitui implements ISubstitui {

	@Override
	public String substituir(String string, String velho, String novo) {
		String str = "";
		StringBuilder s = new StringBuilder();
		StringBuilder st = new StringBuilder();
		st.append(string);
		int tam = string.length();
		int tamS = velho.length();

		for (int i = 0; i < tam; i++) {

			for (int k = i; k < (tamS + i); k++) {
				if (k == tam) {
					continue;
				}
				s.append(string.charAt(k));

			}
			String comp = s.toString();
			if (comp.equals(velho)) {
				for (int q = 0; q < tamS; q++) {
					st.deleteCharAt(i);

				}
				st.replace(i, i, novo);
				string = st.toString();
				tam = st.length();
				i = 0;
			}
			s = new StringBuilder();
		}
		str = st.toString();
		return str;
	}

}
