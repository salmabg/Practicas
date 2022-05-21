package com.example;


public class Main 
{
    public static void main( String[] args )
    {
        Televisor tv = new Televisor("Samsung", "Smart", "Negra");
        CalculadoraStandar calc = new CalculadoraStandar("Casio", "86");
        CalculadoraAvanzada calcA = new CalculadoraAvanzada("CasioA", "90");
    
        System.out.println("Television: " + tv.marca + " Modelo: " + tv.modelo + " Color: " + tv.color);
        

        tv.encender();
        
        System.out.println(tv.cambiarDeCanal());
        
        calc.encender();

        System.out.println(calc.marca);
        System.out.println(calc.modelo);
        
        System.out.println("2 + 2 = " + calc.suma(2, 2));
        System.out.println("5 - 1 = " + calc.resta(5, 1));
        System.out.println("8 * 4 = " + calc.multiplicacion(8, 4));
        System.out.println("9 / 5 = " + calc.division(9, 5));
        calc.apagar();
        calcA.encender();
        System.out.println(calcA.marca);
        System.out.println(calcA.modelo);
        System.out.println("sqrt = " + calcA.sqrt(9));
        System.out.println("4 % 2 = " + calcA.mod(4, 2));
        calcA.apagar();
        

    }
}
