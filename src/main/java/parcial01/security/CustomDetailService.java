package parcial01.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import parcial01.dao.Usuariodao;
import parcial01.entity.Usuario;

@Service
public class CustomDetailService implements UserDetailsService{
	@Autowired
	private Usuariodao usuarioDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario user = usuarioDao.read(username);
		if(user==null) {
			throw new UsernameNotFoundException(username);
		}
		return User.withUsername(user.getNomuser()).password(user.getClave()).authorities("USER").build();
	}

}
