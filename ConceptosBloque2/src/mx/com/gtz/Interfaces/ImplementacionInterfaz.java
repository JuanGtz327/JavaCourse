package mx.com.gtz.Interfaces;

/*Para hacer uso de la iterfaz utilizamos la palabra implements, ademas de que hay
que definir todos los metodos abstractos de dicha interfaz*/

public class ImplementacionInterfaz implements IEjemplo{
    
    public ImplementacionInterfaz(){
        System.out.println(IEjemplo.EJEMPLO);
    }
    
    @Override
    public void conectar(){
        System.out.println("Conexion Exitosa a la base de datos");
    }
    
    @Override
    public void desconectar(){
        System.out.println("Desconexion de la base de datos");
    }
}
