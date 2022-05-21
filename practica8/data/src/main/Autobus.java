package main;
public class Autobus extends Transportes implements SistemaElectrico, ISistemaDeFrenos {
public Autobus(double gas, int velocidad) {
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
            System.out.println("Auto encendido");
        } else {
            System.out.println("Auto sin gasolina");
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
        System.out.println("Auto Apagado");
        return "";
    }
public void sonido() {
        System.out.println("El camion se prepara para detenerse");
    }
@Override
    String acelerar(double gas, int velocidad) {
        if(gas > 0){
            System.out.println("Acelerando hasta: " + velocidad + "KmH");
        } else{
            System.out.println("No hay suficiente gasolina para encender el autobus");
        }
        return "";
    }
}
