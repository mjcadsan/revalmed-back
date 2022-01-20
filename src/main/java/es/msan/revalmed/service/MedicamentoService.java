package es.msan.revalmed.service;

import java.util.Collection;

import es.msan.revalmed.model.Medicamento;

public interface MedicamentoService {
	Medicamento create(Medicamento medicamento);
	Collection<Medicamento> list(int limit);
	Medicamento get(String codigo);
	Medicamento update(Medicamento medicamento);
	Boolean delete(String codigo);

}
