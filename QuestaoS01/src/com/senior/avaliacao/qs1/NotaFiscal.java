package com.senior.avaliacao.qs1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscal implements INotaFiscal {

	@Override
	public List<Double> geraParcelas(int nrParcelas, double valorTotal) {
		List<Double> Parcelas = new ArrayList<Double>();
		BigDecimal VlrParcela = new BigDecimal(valorTotal / nrParcelas).setScale(2, RoundingMode.HALF_EVEN);
		double vlr = 0;
		for (int i = 0; i < nrParcelas; i++) {
			Parcelas.add(VlrParcela.doubleValue());
			vlr += VlrParcela.doubleValue();
		}

		if (vlr != valorTotal) {
			double dif = 0;
			if (vlr > valorTotal) {
				dif = vlr - valorTotal;
				Parcelas.set(Parcelas.size()-1, (VlrParcela.doubleValue() - dif));
			} else if (vlr < valorTotal) {
				dif = valorTotal - vlr;
				Parcelas.set(Parcelas.size()-1, (VlrParcela.doubleValue() + dif));
			}

		}

		return Parcelas;
	}

}
