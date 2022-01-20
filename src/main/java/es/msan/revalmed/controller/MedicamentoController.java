package es.msan.revalmed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.msan.revalmed.model.Medicamento;
import es.msan.revalmed.service.MedicamentoService;

@RestController
@RequestMapping("/api/medicamento")
public class MedicamentoController {
	@Autowired
	private MedicamentoService medicamentoService;
	
	// Crear un nuevo medicamento
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Medicamento medicamento){
		return ResponseEntity.status(HttpStatus.CREATED).body(medicamentoService.create(medicamento));
	}
	
	// Leer un medicamento
	@GetMapping("/{id}")
	public ResponseEntity<?> read (@PathVariable(value="codigo") String codigo){
		Medicamento medicamento = medicamentoService.get(codigo);
		return ResponseEntity.ok(medicamento);
	}
}
