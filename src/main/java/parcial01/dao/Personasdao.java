package parcial01.dao;

import java.util.List;
import java.util.Map;
import parcial01.entity.Personas;

public interface Personasdao {
	int create (Personas per);
    int update (Personas per);
    int delete (int id);
    Personas read (int id);
    List<Map<String,Object>> readAll();
}
