package Fvs.edu.br.topicos.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Fvs.edu.br.topicos.domain.categoria;

@RestController
@RequestMapping(value="/categorias")
public class categoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<categoria> listar() {
		categoria cat1 = new categoria(1 , "bombril");
		categoria cat2 = new categoria(2, "Detergente");
		
		List<categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		return lista;
	}
	
}
