package mx.com.gtz.conexion;

import java.sql.*;
import java.util.*;
import mx.com.gtz.domain.Usuario;

public class UsuarioDAO {
    private static final String USUARIO_SELECT = "SELECT * FROM usuario";
    private static final String USUARIO_INSERT = "INSERT INTO usuario(usuario,password) VALUES (?,?)";
    private static final String USUARIO_UPDATE = "UPDATE usuario SET usuario=?,password=? WHERE id_usuario=?";
    private static final String USUARIO_DELETE = "DELETE from usuario WHERE id_usuario=?";
    
    public List<Usuario> obtenUsuarios(){
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Usuario user = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            conn = Conexion.getConexion(conn);
            pstm = conn.prepareStatement(USUARIO_SELECT);
            rs = pstm.executeQuery();
            while(rs.next()){
                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                user = new Usuario(idUsuario, usuario, password);
                usuarios.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                Conexion.close(rs);
                Conexion.close(pstm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    }
    
    public void insertarUsuario(Usuario user){
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = Conexion.getConexion(conn);
            pstm = conn.prepareCall(USUARIO_INSERT);
            pstm.setString(1, user.getUsuario());
            pstm.setString(2, user.getPassword());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                Conexion.close(conn);
                Conexion.close(pstm);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
    public void actualizarUsuario(Usuario user){
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = Conexion.getConexion(conn);
            pstm = conn.prepareStatement(USUARIO_UPDATE);
            pstm.setString(1, user.getUsuario());
            pstm.setString(2, user.getPassword());
            pstm.setInt(3, user.getIdUsuario());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                Conexion.close(conn);
                Conexion.close(pstm);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
    public void eliminarUsuario(Usuario user){
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = Conexion.getConexion(conn);
            pstm = conn.prepareStatement(USUARIO_DELETE);
            pstm.setInt(1, user.getIdUsuario());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                Conexion.close(conn);
                Conexion.close(pstm);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
