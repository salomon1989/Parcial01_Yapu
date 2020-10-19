package parcial01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import parcial01.entity.Usuario;
import parcial01.service.Usuarioservice;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private Usuarioservice usuarioservice;
	
	@GetMapping("/read{nomuser}")
	public Usuario read(@PathVariable String nomuser) {
		return usuarioservice.read(nomuser);
	}
	
}
