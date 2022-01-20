package es.msan.revalmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.msan.revalmed.model.Medicamento;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, String>{
}
