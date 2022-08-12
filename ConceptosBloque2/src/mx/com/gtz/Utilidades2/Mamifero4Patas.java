package mx.com.gtz.Utilidades2;

import java.util.Objects;

public class Mamifero4Patas extends Mamifero{
    
    private String nombre;
    private int patas;

    public Mamifero4Patas(String nombre){
        super(nombre);
        this.patas=4;
    }
    
    @Override
    public String andar(){
        return super.andar()+"en cuatro patas";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    @Override
    public String toString() {
        return "Mamifero4Patas{" + "nombre=" + nombre + ", patas=" + patas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + this.patas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mamifero4Patas other = (Mamifero4Patas) obj;
        if (this.patas != other.patas) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
     
}