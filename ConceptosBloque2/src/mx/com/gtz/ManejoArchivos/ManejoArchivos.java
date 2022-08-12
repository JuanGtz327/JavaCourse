package mx.com.gtz.ManejoArchivos;

import java.io.*;
import java.io.PrintWriter;


/*Parac crear archivos usamos File y printwtiter*/

public class ManejoArchivos {
    
    public static void crearArchivo(String nombre){
        File f = new File(nombre);
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
    }
    
    public static void escribirArchivo(String nombre,String contenido){
        File f = new File(nombre);
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.println(contenido);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
    }
    
    public static void anexarArchivo(String nombre,String contenido){
        File f = new File(nombre);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f, true));
            pw.println(contenido);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
    
    public static void leerArchivo(String nombre){
        File f = new File(nombre);
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            var lectura = br.readLine();
            while(lectura != null){
                System.out.println(lectura);
                lectura=br.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
