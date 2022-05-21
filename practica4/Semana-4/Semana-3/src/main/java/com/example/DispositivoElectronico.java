package com.example;

public abstract class DispositivoElectronico {
    String marca;
    String modelo;

    DispositivoElectronico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    abstract void encender();
    abstract void apagar();
}
