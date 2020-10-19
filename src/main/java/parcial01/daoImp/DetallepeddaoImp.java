package parcial01.daoImp;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import parcial01.dao.Detallepedidodao;

@Repository
public class DetallepeddaoImp implements Detallepedidodao{
	@Autowired
    private JdbcTemplate jdbctemplate;
	@Override
	public int create(Detallepedidodao dp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Detallepedidodao dp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Detallepedidodao read(int id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="select *from Detallepedido";
		return jdbctemplate.queryForList(SQL);
	}
    
	
   
}
