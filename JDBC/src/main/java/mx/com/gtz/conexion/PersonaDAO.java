package mx.com.gtz.conexion;

import java.sql.*;
import java.util.*;
import mx.com.gtz.domain.Persona;

/*Data Access Object es un patro de diseño donde a cada entidad tiene una clase que ejecuta sus operaciones*/

public class PersonaDAO {
    private static final String PERSONA_SELECT = "SELECT * FROM persona";
    private static final String PERSONA_INSERT = "INSERT INTO persona(nombre,apellido,email,telefono) VALUES (?,?,?,?)";
    private static final String PERSONA_UPDATE = "UPDATE persona SET nombre=?,apellido=?,email=?,telefono=? WHERE id_persona=?";
    private static final String PERSONA_DELETE = "DELETE from persona WHERE id_persona=?";
    
    public List<Persona> obtenPersonas(){
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        try {
            conn = Conexion.getConexion(conn);
            pstm = conn.prepareStatement(PERSONA_SELECT);
            rs = pstm.executeQuery();
            while(rs.next()){
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                persona = new Persona(idPersona,nombre, apellido, email, telefono);
                personas.add(persona);
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
        return personas;
    }
    
    public void insertarPersona(Persona persona){
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = Conexion.getConexion(conn);
            pstm = conn.prepareCall(PERSONA_INSERT);
            pstm.setString(1, persona.getNombre());
            pstm.setString(2, persona.getApellido());
            pstm.setString(3, persona.getEmail());
            pstm.setString(4, persona.getTelefono());
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
    
    public void actualizarPersona(Persona persona){
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = Conexion.getConexion(conn);
            pstm = conn.prepareStatement(PERSONA_UPDATE);
            pstm.setString(1, persona.getNombre());
            pstm.setString(2, persona.getApellido());
            pstm.setString(3, persona.getEmail());
            pstm.setString(4, persona.getTelefono());
            pstm.setInt(5, persona.getIdPersona());
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
    
    public void eliminarPersona(Persona persona){
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = Conexion.getConexion(conn);
            pstm = conn.prepareStatement(PERSONA_DELETE);
            pstm.setInt(1, persona.getIdPersona());
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
