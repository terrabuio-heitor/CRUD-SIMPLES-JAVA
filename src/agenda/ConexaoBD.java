package agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoBD {
    String url = "jdbc:mysql://localhost:3306/Loja";
    String usuario = "root";
    String senha = "";
    public boolean getConexao()
    {
        try
        {        
            Class.forName("com.mysql.jdbc.Driver");
        Connection conexao = DriverManager.getConnection        
        (url,usuario,senha);
                JOptionPane.showMessageDialog
        (null, "Voc� est� conectado !!!");
        return true;
    }
    catch (ClassNotFoundException erro1)
    {
         JOptionPane.showMessageDialog
        (null, "Driver JDBC n�o encontrado!\n"
                +erro1.toString());
         return false;
    }
    catch(SQLException erro2)
    {
            JOptionPane.showMessageDialog
        (null, "Problemas com a conex�o com o BD!"
                + " Verifique o LOGIN e SENHA \n"
                +erro2.toString());
        return false;
    }
    }
       
    public Statement getSt()
    {
    try
    {        
            Class.forName("com.mysql.jdbc.Driver");
        Connection conexao = DriverManager.getConnection
        (url,usuario,senha);
        return conexao.createStatement();
    }
    catch (ClassNotFoundException erro1)
    {
        JOptionPane.showMessageDialog(null,
                    "Driver JDBC n�o encontrado!\n"+erro1.toString());
        return null;
    }
    catch(SQLException erro2)
    {
            JOptionPane.showMessageDialog(null,
                    "Problemas com a conex�o com o BD! Verifique o LOGIN e SENHA \n" +erro2.toString());
        return null;
   
        }  
    }        
    public void fecharConexao()
    {
    try
    {
        Connection conexao = DriverManager.getConnection
        (url,usuario,senha);
        conexao.close();
        JOptionPane.showMessageDialog(null,
                "Voc� foi desconectado!!!");
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,
                "Problemas com a conex�o com o BD! Verifique o LOGIN e SENHA \n" +e.toString());
        }
        }
   
}
