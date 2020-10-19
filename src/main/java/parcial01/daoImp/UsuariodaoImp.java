package parcial01.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import parcial01.dao.Usuariodao;
import parcial01.entity.Usuario;

@Repository
public class UsuariodaoImp implements Usuariodao{
   @Autowired
   private JdbcTemplate jdbctemplate;
	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		String SQL = "select *from usuario where nomuser=?";
		return jdbctemplate.queryForObject(SQL, new Object[] {nomuser},new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
