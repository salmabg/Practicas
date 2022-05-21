package main;
public class run {
public static void main( String[] args) {

        Automovil auto = new Automovil("toyota", 2021);
        Avion aeronave = new Avion("f22", 2022);
        Transportes transporte = new Automovil("generico", 2010);
        SistemaElectrico sistema = new Automovil("sin marca", 0);
        IVolar volar = new Avion("prueba", 0);

        System.out.println("Clase---Hijo Automovil");
        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());
        System.out.println(auto.encender(10));
        System.out.println(auto.encenderLuces());
        System.out.println(auto.avanzar(10));
        System.out.println(auto.frenos());
        System.out.println(auto.apagarLuces());
        System.out.println(auto.apagar());

        System.out.println("Clase---Hijo Avion");
        System.out.println(aeronave.getMarca());
        System.out.println(aeronave.getModelo());
        System.out.println(aeronave.encender(10));
        System.out.println(aeronave.volar());
        System.out.println(aeronave.encenderLuces());
        System.out.println(aeronave.frenos());
        System.out.println(aeronave.apagarLuces());
        System.out.println(aeronave.apagar());

        System.out.println("Clase---padre Transporte");
        System.out.println(transporte.getMarca());
        System.out.println(transporte.getModelo());
        System.out.println(transporte.encender(10));
        System.out.println(transporte.apagar());

        System.out.println("inteface---SistemaElectrico");
        System.out.println(sistema.encenderLuces());
        System.out.println(sistema.apagarLuces());

        System.out.println("inteface---Volar");
        System.out.println(volar.volar());
    }
}
