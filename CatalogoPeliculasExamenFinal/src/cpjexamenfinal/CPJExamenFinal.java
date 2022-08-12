package cpjexamenfinal;

import java.util.Scanner;
import mx.com.gtz.peliculas.negocio.CatalogoPeliculas;
import mx.com.gtz.peliculas.negocio.CatalogoPeliculasImp;

public class CPJExamenFinal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        do {
            menu();
            opcion=scan.nextInt();
            acciones(opcion);
        } while (true);
    }
    
    public static void menu(){
        System.out.println("------------------------------");
        System.out.println("Elige una opcion");
        System.out.println("1.-Iniciar Catalogo Peliculas");
        System.out.println("2.-Agregar Pelicula");
        System.out.println("3.-Listar Peliculas");
        System.out.println("4.-Buscar Pelicula");
        System.out.println("0.-Salir");
        System.out.println("------------------------------");
    }
    
    public static void acciones(int opcion){
        Scanner scan = new Scanner(System.in);
        final String nombreArchivo = "D:\\Juan Gtz\\Documents\\Curso Java\\Peliculas\\peliculas.txt";
        CatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImp();
        
        switch (opcion) {
            case 1:
                catalogoPeliculas.iniciarArchivo(nombreArchivo);
                break;
            case 2:
                System.out.println("Introduce el nombre de una pelicula a agregar: ");
                String nombrePelicula = scan.nextLine();
                catalogoPeliculas.agregarPelicula(nombrePelicula, nombreArchivo);
                break;
            case 3:
                catalogoPeliculas.listarPeliculas(nombreArchivo);
                break;
            case 4:
                System.out.println("Pelicula: ");
                String buscar = scan.nextLine();
                catalogoPeliculas.buscarPelicula(nombreArchivo, buscar);
                break;
            default:
                System.exit(0);
        }
    }
}
