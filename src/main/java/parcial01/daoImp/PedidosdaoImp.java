package parcial01.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import parcial01.dao.Pedidosdao;
import parcial01.entity.Pedidos;

@Repository
public class PedidosdaoImp implements Pedidosdao{
	@Autowired
private JdbcTemplate jdbctemplate;
	@Override
	public int create(Pedidos pe) {
		// TODO Auto-generated method stub
		return jdbctemplate.update("insert into pedidos(fecha)values(?)", pe.getFecha());
	}

	@Override
	public int update(Pedidos pe) {
		// TODO Auto-generated method stub
		String SQL ="update pedidos set fecha=? where idpedidos=?";
		return jdbctemplate.update(SQL, pe.getFecha(),pe.getIdpedidos());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete pedidos where idpedidos=?";
		return jdbctemplate.update(SQL, id);
	}

	@Override
	public Pedidos read(int id) {
		// TODO Auto-generated method stub
		String SQL ="select *from pedidos where idpedidos=?";
		return jdbctemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Pedidos>(Pedidos.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="select *from pedidos";
		return jdbctemplate.queryForList(SQL);
	}

}
