package main;
import java.util.Scanner;
public class Main 
{
public static void main( String[] args )
    {
        // Televisor tv = new Televisor("Samsung", "Smart", "Negra");
        // CalculadoraStandar calc = new CalculadoraStandar("Casio", "86");
        // CalculadoraAvanzada calcA = new CalculadoraAvanzada("CasioA", "90");
    
        // System.out.println("Television: " + tv.marca + " Modelo: " + tv.modelo + " Color: " + tv.color);
        
        Scanner valor = new Scanner(System.in);

        CalculadoraStandar[] calculadoras = new CalculadoraStandar[5]; 

        Televisor[] televisiones = new Televisor[5];

        for (int i = 0; i < calculadoras.length; i++) {
            System.out.print("marca:");
            String marcaCalculadora = valor.next();
            System.out.print("modelo:");
            String modeloCalculadora = valor.next();

            calculadoras[i] = new CalculadoraStandar(marcaCalculadora, modeloCalculadora);
            
        }

        for (CalculadoraStandar calculadora : calculadoras) {
            System.out.println("");
            System.out.println("marca: " + calculadora.getMarca());
            System.out.println("modelo: " + calculadora.getModelo());
            calculadora.encender();
            System.out.println("2 + 2 = " + calculadora.suma(2, 2));
            System.out.println("5 - 1 = " + calculadora.resta(5, 1));
            System.out.println("8 * 4 = " + calculadora.multiplicacion(8, 4));
            System.out.println("9 / 5 = " + calculadora.division(9, 5));
            calculadora.apagar();
        }

        for (int i = 0; i < televisiones.length; i++) {
            System.out.print("marca");
            String marcaTelevision = valor.next();
            System.out.print("modelo: ");
            String modeloTelevision = valor.next();
            System.out.print("color: ");
            String colorTelevision = valor.next();

            televisiones[i] = new Televisor(marcaTelevision, modeloTelevision, colorTelevision);

            System.out.println("");
            System.out.println("marca: " + televisiones[i].getMarca());
            System.out.println("modelo: " + televisiones[i].getModelo());            
            televisiones[i].encender();
            televisiones[i].subirVolumen();
            System.out.println(televisiones[i].cambiarDeCanal());
            televisiones[i].bajarVolumen();
            televisiones[i].apagar();
        }
        valor.close();
    }
}
