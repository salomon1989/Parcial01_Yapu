package parcial01.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import parcial01.dao.Platosdao;
import parcial01.entity.Platos;

@Repository
public class PlatosdaoImp implements Platosdao{
    @Autowired
    private JdbcTemplate jdbctemplate;
	@Override
	public int create(Platos pl) {
		// TODO Auto-generated method stub
		return jdbctemplate.update("insert into platos(nombres,telefono,correo)values(?,?,?)", pl.getNombre(),pl.getPrecio());
	}

	@Override
	public int update(Platos pl) {
		// TODO Auto-generated method stub
		String SQL ="update platos set nombre=? where idplatos=?";
		return jdbctemplate.update(SQL, pl.getNombre(), pl.getIdplatos());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete platos where idplatos=?";
		return jdbctemplate.update(SQL, id);
	}

	@Override
	public Platos read(int id) {
		// TODO Auto-generated method stub
		String SQL ="select *from platos where idplatos=?";
		return jdbctemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Platos>(Platos.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="select *from platos";
		return jdbctemplate.queryForList(SQL);
	}

}
