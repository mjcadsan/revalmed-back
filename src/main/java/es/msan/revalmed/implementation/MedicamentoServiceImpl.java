package es.msan.revalmed.implementation;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import es.msan.revalmed.model.Medicamento;
import es.msan.revalmed.repository.MedicamentoRepository;
import es.msan.revalmed.service.MedicamentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class MedicamentoServiceImpl implements MedicamentoService {
	private final MedicamentoRepository medicamentoRepo;

	@Override
	public Medicamento create(Medicamento medicamento) {
		return medicamentoRepo.save(medicamento);
	}

	@Override
	public Collection<Medicamento> list(int limit) {
		return medicamentoRepo.findAll(PageRequest.of(0, limit)).toList();
	}

	@Override
	public Medicamento get(String codigo) {
		return medicamentoRepo.findById(codigo).get();
	}	

	@Override
	public Medicamento update(Medicamento medicamento) {
		return medicamentoRepo.save(medicamento);
	}

	@Override
	public Boolean delete(String codigo) {
		medicamentoRepo.deleteById(codigo);
		return Boolean.TRUE;
	}
}
