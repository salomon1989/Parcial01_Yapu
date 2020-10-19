package parcial01.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import parcial01.dao.Usuariodao;
import parcial01.entity.Usuario;
import parcial01.service.Usuarioservice;

public class UsuarioserviceImp implements Usuarioservice{
    @Autowired
    private Usuariodao usuariodao;
	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		return usuariodao.read(nomuser);
	}

}
