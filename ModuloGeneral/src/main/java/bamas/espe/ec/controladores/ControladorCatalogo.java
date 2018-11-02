package bamas.espe.ec.controladores;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bamas.espe.ec.interfaces.InterfaceCatalogo;
import bamas.espe.ec.modelos.Catalogo;

@Controller
@RequestMapping("/catalogo")
public class ControladorCatalogo extends AbstracControlador<InterfaceCatalogo, Catalogo> {

	
	@PostMapping("/hijos/lista")
	@ResponseBody
	public CompletableFuture<List<Catalogo>> findByListaPadreId(@Valid @RequestBody Long[] body) {
		//String str = String.join(",", body);
		return CompletableFuture.completedFuture(repo.findByListaPadreId(body));

	}
}
