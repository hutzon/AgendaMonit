
package paquete;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author OTTONIEL CAMPOS
 */
public class Conexion {

    
      public Connection getConnection (){
        Connection conexion=null;
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","monit","charli$$");
            //JOptionPane.showMessageDialog(null,"Conexion Exitosa");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error de Conexion");
            System.err.println("Error, "+ex);
            
        }
        
        return conexion;
        
    }
      
      
    
}
