package parcial01.dao;

import java.util.List;
import java.util.Map;

import parcial01.entity.Platos;

public interface Platosdao {
    int create (Platos pl);
    int update (Platos pl);
    int delete (int id);
    Platos read (int id);
    List<Map<String,Object>> readAll();
}
