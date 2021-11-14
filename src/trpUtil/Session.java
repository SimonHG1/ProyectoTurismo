package trpUtil;

import java.util.HashMap;
import java.util.Map;


public final class Session {
    
    private static final Map<String, Object> datos;
    
    static {
        datos = new HashMap<>();
    }
    
    private Session(){
    }
    
    public static void put(String key, Object value) {
        datos.put(key, value);
    }
    
    public static Object get(String key) {
        return datos.get(key);
    }
    
}
