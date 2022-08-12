package mx.com.gtz.conexion;

import java.sql.*;

/*Es necesario hacer una clase esxclusiva para crear las conexiones y cerrar las mismas de modo que el codigo
pueda ser reutilizable por otras clases*/

public class Conexion {
    private static final String url="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String user="root";
    private static final String password="admin";
    
    public static Connection getConexion(Connection conn) throws SQLException{
        //Class.forName("com.mysql.cj.jdbc.Driver"); //Es usado cuando la conexion se implementa en servicios web
        return DriverManager.getConnection(url,user,password);
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement stm) throws SQLException{
        stm.close();
    }
    
    public static void close(PreparedStatement stm) throws SQLException{
        stm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
   
}
