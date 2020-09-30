package com.senior.avaliacao.qs4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conversor implements IConversor {

	@Override
	public String converteBase5(int decimal) {
		String vlrConv = "";
		StringBuilder str = new StringBuilder();

		double x = decimal;

		while (x != 0) {

			if (x != (int) x) {
				BigDecimal res = new BigDecimal(x - (int) x).setScale(2, RoundingMode.HALF_EVEN);
				int i = (int) (res.doubleValue() * 5);
				str.append(Integer.toString(i));
				x = (int) x;
			} else {
				double vlr = (x / 5);
				if (vlr != (int) vlr) {
					x = vlr;
					continue;
				}
				str.append("0");
				x = vlr;
			}
		}
		str.reverse();
		vlrConv = str.toString();
		return vlrConv;
	}

}
