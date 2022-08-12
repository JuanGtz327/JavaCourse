package mx.com.gtz.Excepciones;

/*Hay dos tipos las Exception las cuales requieren un bloque try catch ya que se validan en tiempo
de compilacion y por otro lado estan las RuntimeException las cuales no obligan a añadir un bloque
try catch*/

public class MalaOperacionExcepcion extends RuntimeException{    
    public MalaOperacionExcepcion(String msg){
        super(msg);
    }
}
