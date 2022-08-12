package mx.com.gtz.Generics;

/*Una clase generica implica que puede recibir tipos de datos que aun no conocemos
y en base a estos ejecutar alguna funcionalidad para esto se ocupa la notacion de
diamante*/
public class ClaseGenerica <T>{
    
    private T variable;
    
    public ClaseGenerica(T variable){
        this.variable = variable;
    }
    
    public void tipoVariable(){
        System.out.println("Tipo "+variable.getClass().getSimpleName());
    }
    
}
