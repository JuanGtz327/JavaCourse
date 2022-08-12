package mx.com.gtz.test;

import java.util.List;
import mx.com.gtz.conexion.PersonaDAO;
import mx.com.gtz.conexion.UsuarioDAO;
import mx.com.gtz.domain.Persona;
import mx.com.gtz.domain.Usuario;

/*Para hacer la conexion, hay que especificar la url de conexion ademas de cerrar los objetos de conexion despues de usarlos*/

public class TestMySQL {
    public static void main(String[] args) {
//        PersonaDAO person = new PersonaDAO();
//        Persona personaNueva = new Persona("Ramiro", "Gutierrez", "ramis2003@gmail.com", "5546829137");
//        person.insertarPersona(personaNueva);
//        Persona personaActualizada = new Persona(5, "Ramis", "Ayala", "newramis@gmail.com", "5500000000");
//        person.actualizarPersona(personaActualizada);
//        Persona personaBorrada = new Persona(6);
//        person.eliminarPersona(personaBorrada);
//        List<Persona> personas = person.obtenPersonas();
//        for(Persona persona: personas){
//            System.out.println(persona);
//        }

        UsuarioDAO user = new UsuarioDAO();
//        Usuario usuarioNuevo = new Usuario("The_Charly327", "Nolosepollas123+");
//        Usuario usuarioNuevo2 = new Usuario("Deerbty", "202060386Sa+");
//        Usuario usuarioNuevo3 = new Usuario("JuanGtz327", "2017095751Sa+");
//        user.insertarUsuario(usuarioNuevo);
//        user.insertarUsuario(usuarioNuevo2);
//        user.insertarUsuario(usuarioNuevo3);
//        
//        List<Usuario> listaUsuarios = user.obtenUsuarios();
//        for(Usuario usuario: listaUsuarios){
//            System.out.println(usuario);
//        }
        
        Usuario usuarioActualizado = new Usuario(2, "DeerbyRockMan", "12345");
        user.actualizarUsuario(usuarioActualizado);
        
        Usuario usuarioEliminado = new Usuario(3);
        user.eliminarUsuario(usuarioEliminado);
        
        List<Usuario> listaUsuarios = user.obtenUsuarios();
        for(Usuario usuario: listaUsuarios){
            System.out.println(usuario);
        }
    }
}
