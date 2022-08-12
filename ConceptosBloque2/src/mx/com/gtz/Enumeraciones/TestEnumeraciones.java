package mx.com.gtz.Enumeraciones;

/*Para hacer uso de una enumeracion no es necesario crear una istancia
simplemente accedemos a los valores*/

public class TestEnumeraciones {
    public static void main(String[] args) {
        Enumeracion bandas = null;
        imprimeBandas(bandas);
        imprimeVocalistas(bandas);
    }
    
    public static void imprimeBandas(Enumeracion enu){
        System.out.println(Enumeracion.ACDC);
        System.out.println(Enumeracion.AEROSMITH);
        System.out.println(Enumeracion.BLACKSABATH);
        System.out.println(Enumeracion.GUNSNROSES);
        System.out.println(Enumeracion.KISS);
    }
    
    public static void imprimeVocalistas(Enumeracion enu){
        System.out.println(Enumeracion.ACDC.getVocalista());
        System.out.println(Enumeracion.AEROSMITH.getVocalista());
        System.out.println(Enumeracion.BLACKSABATH.getVocalista());
        System.out.println(Enumeracion.GUNSNROSES.getVocalista());
        System.out.println(Enumeracion.KISS.getVocalista());
    }
}
