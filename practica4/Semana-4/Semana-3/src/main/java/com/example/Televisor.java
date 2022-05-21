package com.example;

public class Televisor extends DispositivoElectronico implements IFunciones {
    String color;
    int canal;
    int volumen;

    Televisor(String marca, String modelo, String color) {
        super(marca, modelo);
        this.color = color;
    }

    public void encender() {
        System.out.println("Television encendida");
    }

    public void apagar() {
        System.out.println("Television apagada");
    }

    public void subirVolumen() {
        this.volumen += 1;
    }

    public void bajarVolumen() {
        this.volumen -= 1;
    }

    public String cambiarDeCanal() {
        System.out.println("Se ha cambiado el canal");
        return "Canal 5";
    }
}
