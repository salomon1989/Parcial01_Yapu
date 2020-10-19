package parcial01.dao;

import java.util.List;
import java.util.Map;
import parcial01.entity.Pedidos;

public interface Pedidosdao {
  int create (Pedidos pe);
  int update (Pedidos pe);
  int delete (int id);
  Pedidos read(int id);
  List<Map<String,Object>> readAll();
}
