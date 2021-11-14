
package trpTest;

import java.sql.Connection;
import trpBD.AccesoDB;


public class TestConexion {
    
     public static void main(String[] args) {
      try {
         Connection cn = AccesoDB.getConnection();
         System.out.println("Conexión Correcta");
         cn.close();
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
   }
}
