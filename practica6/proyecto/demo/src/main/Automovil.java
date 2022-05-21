package main;
public class Automovil extends Transportes implements SistemaElectrico, ISistemaDeFrenos {
public Automovil(String marca, int modelo) {
        super(marca, modelo);
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
 public String avanzar(double gas) {
        if (gas > 0) {
            System.out.println("Avanzando...");
            return "";
        }else{
            System.out.println("El auto se ha quedado sin gasolina");
            return "";
        }
    }
}
