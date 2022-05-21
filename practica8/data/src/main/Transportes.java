package main;
public abstract class Transportes {
    private double gas;
    private int velocidad;

public Transportes(double gas, int velocidad) {
        this.gas = gas;
        this.velocidad = velocidad;
    }

    abstract String encender(double gas);

    abstract String acelerar(double gas, int velocidad);

    abstract String apagar();

    public int getvelocidad() {
        return velocidad;
    }
public void setvelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
public double getgas() {
        return gas;
    }
public void setgas(double gas) {
        this.gas = gas;
    }
}
