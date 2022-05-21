package main;
import java.util.ArrayList;
public class run {
public static void main( String[] args) {

        ArrayList<Transportes> al = new ArrayList<Transportes>();
        al.add(new Autobus(10, 300));
        al.add(new Avion(12, 200));
        al.add(new Barco(0, 9));
        al.add(new Helicoptero(1, 10));      
        
        for (Transportes transporte: al){
            System.out.println(transporte.getClass().toString());
            transporte.encender(transporte.getgas());
            transporte.acelerar(transporte.getgas(), transporte.getvelocidad());
            transporte.apagar();
        }
    }
}
