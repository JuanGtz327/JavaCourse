package mx.com.gtz.peliculas.negocio;

import java.util.ArrayList;
import java.util.List;
import mx.com.gtz.peliculas.datos.AccesoDatos;
import mx.com.gtz.peliculas.datos.AccesoDatosImp;
import mx.com.gtz.peliculas.domain.Pelicula;
import mx.com.gtz.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gtz.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImp implements CatalogoPeliculas{
    AccesoDatos datos;
    
    public CatalogoPeliculasImp(){
        datos = new AccesoDatosImp();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        if (nombrePelicula=="") {
            throw new EscrituraDatosEx("No se asigno un nombre a la pelicula");
        }
        if (nombreArchivo=="") {
            throw new EscrituraDatosEx("No se encontro un nombre de archivo valido");
        }
        datos.escribir(new Pelicula(nombrePelicula), nombreArchivo, true);
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        if (nombreArchivo=="") {
            throw new EscrituraDatosEx("No se encontro un nombre de archivo valido");
        }
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas = datos.listar(nombreArchivo);
        if (peliculas==null) {
            throw new LecturaDatosEx("No hay archivos para leer");
        }
        for(Pelicula pelicula:peliculas){
            System.out.println(pelicula.getNombre());
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        if (nombreArchivo=="") {
            throw new EscrituraDatosEx("No se encontro un nombre de archivo valido");
        }
        datos.buscar(nombreArchivo, buscar);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        if (nombreArchivo=="") {
            throw new EscrituraDatosEx("No se encontro un nombre de archivo valido");
        }
        if (!datos.existe(nombreArchivo)) {
            datos.crear(nombreArchivo);
        }
    }
    
}
