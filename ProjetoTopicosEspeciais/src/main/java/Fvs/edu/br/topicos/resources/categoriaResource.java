package Fvs.edu.br.topicos.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Fvs.edu.br.topicos.domain.Categoria;
import Fvs.edu.br.topicos.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class categoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		
		
		return ResponseEntity.ok().body(obj);
	}
	
}
