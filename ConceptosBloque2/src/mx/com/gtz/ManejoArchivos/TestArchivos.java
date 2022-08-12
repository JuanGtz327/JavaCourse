package mx.com.gtz.ManejoArchivos;

public class TestArchivos {
    public static void main(String[] args) {
        ManejoArchivos.crearArchivo("ArchivoPrueba.txt");
        ManejoArchivos.escribirArchivo("ArchivoPrueba.txt", "Texto a");
        ManejoArchivos.anexarArchivo("ArchivoPrueba.txt", "Texto b");
        ManejoArchivos.anexarArchivo("ArchivoPrueba.txt", "Texto c");
        ManejoArchivos.leerArchivo("ArchivoPrueba.txt");
    }
}
