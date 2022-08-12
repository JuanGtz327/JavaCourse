package mx.com.gtz.ventas;

public class Orden {
    private static final int MAX_PRODUCTOS=10;
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.productos=new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        this.productos[this.contadorProductos]=producto;
        this.contadorProductos++;
    }
    
    public double calcularTotal(){
        double total=0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total+=this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("IdOrden: "+this.idOrden);
        System.out.println("Productos Orden:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("Total Orden: $"+this.calcularTotal());
    }
}
