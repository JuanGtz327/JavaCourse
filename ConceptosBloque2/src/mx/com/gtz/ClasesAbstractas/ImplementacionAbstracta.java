package mx.com.gtz.ClasesAbstractas;

/*Al implementar una clase abstracta, es necesario aplicar herencia y ademas
definir todos los metodos de la clase padre abstracta*/

public class ImplementacionAbstracta extends ClaseAbstracta{
    
    private String text;
    
    public ImplementacionAbstracta(){

    }
    
    public ImplementacionAbstracta(String text){
        this.text=text;
    }
    
    @Override
    public void sayHello(){
        System.out.println("Hello");
    }
    
    @Override
    public void saySomething(){
        System.out.println(text);
        
    }
    
    @Override
    public void sayGoodbye(){
        System.out.println("Goodbye");
        super.informe();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
      
}
