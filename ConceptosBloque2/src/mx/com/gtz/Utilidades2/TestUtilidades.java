package mx.com.gtz.Utilidades2;

public class TestUtilidades {
    public static void main(String[] args) {
        Mamifero mam1 = new Mamifero2Patas("Horangutan");
        Mamifero mam2 = new Mamifero2Patas("Pinguino");
        Mamifero mam3 = new Mamifero2Patas("Pato");
        
        Mamifero mam4 = new Mamifero4Patas("Venado");
        Mamifero mam5 = new Mamifero4Patas("Perro");
        Mamifero mam6 = new Mamifero4Patas("Rinoceronte");
        
        Mamifero mamiferos[]={mam1,mam2,mam3,mam4,mam5,mam6};
        
        //Uso del ciclo forEach donde el lado izquierdo es el tipo de dato y el derecho el arreglo a recorrer
        for(Mamifero mamifero:mamiferos){
            System.out.println(mamiferoAndar(mamifero));
            
            if (mamifero instanceof Mamifero2Patas) {
                System.out.println("Soy un mamifero de 2 patas");
            }
            if (mamifero instanceof Mamifero4Patas) {
                System.out.println("Soy un mamifero de 4 patas");
            }
        }
        
        mam1.manadas(1,3,5,4,8,7);//Uso de argumetos variables
        mam1.caminar();
        
        Mamifero2Patas pa2 = new Mamifero2Patas("Pios");
        Mamifero2Patas pa22 = new Mamifero2Patas("Pinguino");
        
        if(pa2.equals(pa22)){
            System.out.println("SI");
        }
            
        System.out.println(pa2.hashCode()==pa22.hashCode()?"SI":"NO");
    }
    
    public static String mamiferoAndar(Mamifero mamifero){
        /*En este metodo entra el concepto de polimorfismo, ya que de una clase en general podemos
        asignar clases hijas de modo que se ejecutes distintos comportamientos para cade uno de estos
        objetos*/
        return mamifero.andar();
    }
}
