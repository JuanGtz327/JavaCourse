package mx.com.gtz.Utilidades2;

import java.io.Serializable;

/*Una clase JavaBean es aquella que implementa encapsulamiento ademas de los metodos get y set
asi como constructor vacio e implementa de la clase serializable*/

public class Mamifero implements Serializable{

    private int idMamifero;
    private String nombre;
    private static int contadorMamiferos;
    
    static{
        /*Esto se ejecuta solo una vez y es cuando se crea la clase en memoria*/
        System.out.println("Bloque estatico");
    }
    
    {
        /*Esto se ejecuta siempre que se crea un objeto de esta clase, ademas de que
        se ejecuta antes del constructor*/
        System.out.println("Bloque Dinamico");
    }
    
    private Mamifero(){
        this.idMamifero = ++contadorMamiferos;
    }
    
    public Mamifero(String nombre){
        this();
        this.nombre = nombre;
    }
    
    public String andar(){
        //Este metodo sera sobreescrito usando la anotacion @Override
        return "Este mamifero anda ";
    }
    
    public void caminar(){
        /*El uso de autoboxing y unboxing implican usar clases envolventes, es decir que para cada
        tipo de dato primitivo tenemos una clase Object que lo envuelve*/
        
        Integer numPasos = 10; //Autoboxing ya que aun Object le asignamos un tipo primitivo
        int numPasosVar = numPasos; //Unboxing ya que de la clase Object pasamos al dato primitivo
        System.out.println("Este puede dar hasta "+numPasosVar+" pasos");
    }
    
    public void manadas(int... num){
        /*Este es un metodo que recibe argumentos variables, es decir que pueden ser cuantos queramos
        y comunmente es semejante a un arreglo si es que pasamos muchos valores*/
        for (int i = 0; i < num.length; i++) {
            System.out.println("Este mamifero anda en manadas de "+num[i]);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdMamifero() {
        return idMamifero;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "idMamifero=" + idMamifero + ", nombre=" + nombre + '}';
    }

}
