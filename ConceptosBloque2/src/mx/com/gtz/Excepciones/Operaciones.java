package mx.com.gtz.Excepciones;

/*Para hacer uso de la excepcion personalizada, es necesario usar la palabra throw*/

public class Operaciones {
    private int op1;
    private int op2;
    
    public Operaciones(int op1,int op2){
        this.op1 = op1;
        this.op2 = op2;
    }
    
    public int suma(){
        return op1+op2;
    }
    
    public int resta(){
        return op1-op2;
    }
    
    public int multiplicacion(){
        return op1*op2;
    }
    
    public int division() throws MalaOperacionExcepcion{
        if (op2==0) {
            throw new MalaOperacionExcepcion("No se puede dividir entre cero");
        }
        return op1/op2;
    }
}
