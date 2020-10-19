package parcial01.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import parcial01.dao.Personasdao;
import parcial01.entity.Personas;

@Repository
public class PersonasdaoImp implements Personasdao{
    @Autowired
    private JdbcTemplate jdbctemplate;
	@Override
	public int create(Personas per) {
		// TODO Auto-generated method stub
		return jdbctemplate.update("insert into personas(nombres,telefono,correo)values(?,?,?)", per.getNombres(),per.getTelefono(),per.getCorreo());
	}

	@Override
	public int update(Personas per) {
		// TODO Auto-generated method stub
		String SQL ="update personas set nombres=? where idpersonas=?";
		return jdbctemplate.update(SQL, per.getNombres(), per.getIdpersonas());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete personas where idpersonas=?";
		return jdbctemplate.update(SQL, id);
	}

	@Override
	public Personas read(int id) {
		// TODO Auto-generated method stub
		String SQL ="select *from personas where idpersonas=?";
		return jdbctemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Personas>(Personas.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="select *from personas";
		return jdbctemplate.queryForList(SQL);
	}

}
