package main;
public class Avion extends Transportes implements SistemaElectrico, ISistemaDeFrenos, IVolar {
public Avion(String marca, int modelo) {
        super(marca, modelo);
    }
@Override
public String volar() {
        System.out.println("el avion despego");
        return "";
    }
@Override
public String frenos() {
        System.out.print("el avion esta desacelerando");
        return "";
    }
@Override
public String encenderLuces() {
        System.out.println("Luces encandidas");
        return "";
    }
@Override
public String apagarLuces() {
        System.out.println("Luces apagadas");
        return "";
    }
@Override
String encender(double gas) {
        if (gas > 0) {
            System.out.println("El avion esta encendido");
        } else {
            System.out.println("El avion no cuenta con suficiente diesel");
        }
        return "";
    }
@Override
String apagar() {
        System.out.println("Avion apagado");
        return "";
    }
    
}
