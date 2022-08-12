package mx.com.gtz.ClasesAbstractas;

/*El hecho de que sea abstracta implica que no se pueden crear instancias de esta clase
ademas los metodos de esta clase pueden ser o no abstractos, donce un metodo abstracto
es solo la definicion de dicho metodo*/
public abstract class ClaseAbstracta {
    public final static String VALOR="MiClaseAbstracta";
    
    public abstract void sayHello();
    
    public abstract void saySomething();
    
    public abstract void sayGoodbye();
    
    public void informe(){
        System.out.println("Soy un metodo NO abstracto");
    }
}
