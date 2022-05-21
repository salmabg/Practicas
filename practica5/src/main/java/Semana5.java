/*Andres Hernandez Yañez*/
public class Semana5 {

    public static void main(String[] args) {
    
        System.out.println(" Automovil -- Clase hija");
        Automovil topaz = new Automovil();
	System.out.println(topaz.encender(0));
        System.out.println(topaz.encenderLuces());
        topaz.apagar();
        
        System.out.println(" Transporte -- Clase padre");
        Transporte topazGuia = new Automovil();
        System.out.println(topazGuia.encender(0));
        topazGuia.apagar();
        
        System.out.println(" ISistemaElectrico -- Interface");
        ISistemaElectrico topazX = new Automovil();
        System.out.println(topazX.encenderLuces());
	
        /*
        System.out.println(" Avion -- Clase hija");
        Avion topazY = new Avion();
        System.out.println(topazY.despegar());
        */
 
    }
}
