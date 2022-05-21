package main;
public abstract class Transportes {
    private String marca;
    private int modelo;
public Transportes(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    abstract String encender(double gas);
    abstract String apagar();

    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
