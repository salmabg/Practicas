package com.example;

public class CalculadoraStandar extends DispositivoElectronico implements IOperacioneStandar {

    CalculadoraStandar(String marca, String modelo) {
        super(marca, modelo);
    }

    public void encender() {
        System.out.println("Calculadora encendida");
    }

    public void apagar() {
        System.out.println("Calculadora apagada");
    }

    public double suma(double a, double b) {
        return a+b;
    }

    public double resta(double a, double b) {
        return a-b;
    }

    public double multiplicacion(double a, double b) {
        return a*b;
    }

    public double division(double a, double b) {
        return a/b;
    }

}