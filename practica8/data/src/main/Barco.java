package main;
public class Barco extends Transportes implements ISistemaDeFrenos, SistemaElectrico {
public Barco(double gas, int velocidad) {
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
            System.out.println("Barco encendido");
        } else {
            System.out.println("Barco sin gasolina");
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
        System.out.println("Barco Apagado");
        return "";
    }
@Override
    String acelerar(double gas, int velocidad) {
        if(gas > 0){
            System.out.println("Acelerando hasta: " + velocidad + "KmH");
        } else{
            System.out.println("No hay suficiente gasolina para encender el barco");
        }
        return "";
    }
public void soltarAnclas(){
        System.out.println("Anclas desplegadas");
    }
}
