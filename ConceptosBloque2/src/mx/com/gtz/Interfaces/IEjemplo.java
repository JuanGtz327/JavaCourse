package mx.com.gtz.Interfaces;

/*Una interface usa la palabra reservada iterface y es obligatorio que todos sus metodos
sean abstractos ademas de que los atributos son constantes, los elementos de esta intrfaz
no pueden tener un modificador de acceso private*/

public interface IEjemplo {
    
    public static final String EJEMPLO = "Esta es una interfaz";
    
    public abstract void conectar();
    
    public abstract void desconectar();
    
}
