package mx.com.gtz.Enumeraciones;

/*Las enumeraciones son listas de datos, que contienen informacion a utilizar
donde solo usamos el valor de los datos, ademas usamos la palabra reservada enum
como detalle su constructor no lleva modificador de acceso*/

public enum Enumeracion {
    ACDC("Brian Jhonson"),
    BLACKSABATH("Ozzy osburne"),
    KISS("Paul Stanley"),
    GUNSNROSES("Axel Rose"),
    AEROSMITH("Steven Taylor");
    
    private final String vocalista;
    
    Enumeracion(String vocalista){
        this.vocalista = vocalista;
    }
    
    public String getVocalista(){
        return this.vocalista;
    }
}
