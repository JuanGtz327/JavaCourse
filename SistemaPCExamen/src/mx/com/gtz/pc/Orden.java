package mx.com.gtz.pc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=5;
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.computadoras=new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadoras(Computadora computadora){
        if (this.contadorComputadoras<Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++]=computadora;
        }else{
            System.out.println("Se ha excedido el numero de computadoras");
        }
    }
    
    public void mostrarOrden(){
        System.out.println("IdOrden: "+this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
