package main;
public class Helicoptero extends Transportes implements ISistemaDeFrenos, SistemaElectrico {
public Helicoptero(double gas, int velocidad) {
        super(gas, velocidad);
    }
@Override
    public String encenderLuces() {
        System.out.println("Luces encendidas");
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
            System.out.println("Helicoptero encendido");
        } else {
            System.out.println("Helicoptero sin gasolina");
        }
        return "";
    }
@Override
    public String frenos() {
        System.out.println("Frendando...");
        return "";
    }
@Override
    public String apagar() {
        System.out.println("Helicoptero Apagado");
        return "";
    }
@Override
    String acelerar(double gas, int velocidad) {
        if(gas > 0){
            System.out.println("Aumentando rotaciones para acelerar hasta: " + velocidad + "KmH");
        } else{
            System.out.println("No hay suficiente gasolina para encender el helicoptero");
        }
        return "";
    }
}
