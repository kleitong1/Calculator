import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBD  {

    public void Calculo() throws SQLException, ClassNotFoundException
    {
           
Connection conexao = ObterConexao();

Statement statement = conexao.createStatement();

String query = "insert into calculadora (valor1 ,valor2, resultado) values " + "(" + Calculator.valor1 + "," + Calculator.valor2 + "," + Calculator.kit + ")";
ResultSet resultSet = statement.executeQuery(query);

System.out.println("Registro Incluido");
    }

public static Connection ObterConexao() throws ClassNotFoundException, SQLException
{
        


Connection conexao = null;

Class.forName("oracle.jdbc.driver.OracleDriver");

conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "uniabc01");

return conexao;

}
}