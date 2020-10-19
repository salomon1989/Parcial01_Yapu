package parcial01.service;

import java.util.List;
import java.util.Map;

import parcial01.entity.Pedidos;

public interface Platosservice {
	int create (Pedidos pe);
	int update (Pedidos pe);
	int delete (int id);
	Pedidos read(int id);
	List<Map<String,Object>> readAll();
}
