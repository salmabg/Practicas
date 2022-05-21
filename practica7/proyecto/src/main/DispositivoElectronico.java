package main;

public abstract class DispositivoElectronico {
    private String marca;
    private String modelo;

DispositivoElectronico(String marca, String modelo) {
        this.setMarca(marca);
        this.setModelo(modelo);
    }
public String getMarca() {
        return marca;
    }
public void setMarca(String marca) {
        this.marca = marca;
    }
public String getModelo() {
        return modelo;
    }
public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    abstract void encender();
    abstract void apagar();
}
