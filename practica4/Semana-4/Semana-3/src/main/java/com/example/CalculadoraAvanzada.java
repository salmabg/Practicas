package com.example;

public class CalculadoraAvanzada extends DispositivoElectronico implements IOperacioneAvanzadas {
    
    CalculadoraAvanzada(String marca, String modelo) {
        super(marca, modelo);
    }

    public void encender() {
        System.out.println("Calculadora avanzada encendida");
    }

    public void apagar() {
        System.out.println("Calculadora avanzada apagada");
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double mod(double a, double b) {
        return a % b;
    }


}
