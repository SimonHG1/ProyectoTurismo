package trpServiceEspecificacion;

import java.util.List;


public interface CrudSpec <C>{
    
    C traerId (String id);
    List<C> traerLista (C bean);
    void insertar (C bean);
    void actualizar (C bean);
    void eliminar (String id);
       
}
