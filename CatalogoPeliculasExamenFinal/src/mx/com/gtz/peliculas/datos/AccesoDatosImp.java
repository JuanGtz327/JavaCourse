package mx.com.gtz.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gtz.peliculas.domain.Pelicula;

public class AccesoDatosImp implements AccesoDatos{

    @Override
    public boolean existe(String nombreArchivo) {
        File f = new File(nombreArchivo);
        return f.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre) {
        List<Pelicula> peliculasList = new ArrayList<>();
        File f = new File(nombre);
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            var lectura = br.readLine();
            while(lectura != null){
                Pelicula pelicula = new Pelicula(lectura);
                peliculasList.add(pelicula);
                lectura = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        } 
        return peliculasList;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
        File f = new File(nombreArchivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f,anexar));
            pw.println(pelicula.getNombre());
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        } 
    }

    @Override
    public void buscar(String nombreArchivo, String buscar) {
        List<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas=listar(nombreArchivo);
        for(Pelicula pelicula:listaPeliculas){
            if (buscar.equals(pelicula.getNombre())) {
                System.out.println("La pelicula "+pelicula.getNombre()+" se encuentra en el catalogo");
                return;
            }
        }
        System.out.println("La pelicula no se encuentra en el catalogo");
    }

    @Override
    public void crear(String nombreArchivo) {
        File f = new File(nombreArchivo);
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }  
    }

    @Override
    public void borrar(String nombreArchivo) {
        File f = new File(nombreArchivo);
        f.delete();
    }
    
}
