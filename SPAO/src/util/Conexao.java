
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Cascao
 */
public class Conexao {
    
    public static Connection getConexao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/spao2","root", "");
            return c;
            
        }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco");
                    e.printStackTrace();
                    return null;
        }
    
    }
    
    public static void main (String [] arg){
        if(Conexao.getConexao() == null){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco");
        }else
            JOptionPane.showMessageDialog(null, "Conectado");
    
    }
}
