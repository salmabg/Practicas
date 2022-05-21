public abstract class Dispositivo_electronico {
private String marca;
public abstract void encender();
public String apagar() {
        return "Dispositivo Apagado";
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
