package parcial01.dao;

import java.util.List;
import java.util.Map;


public interface Detallepedidodao {
	int create (Detallepedidodao dp);
    int update (Detallepedidodao dp);
    int delete (int id);
    Detallepedidodao read (int id);
    List<Map<String,Object>> readAll();
}
