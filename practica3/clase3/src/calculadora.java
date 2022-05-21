public class calculadora extends Dispositivo_electronico {
public void encender() {
      System.out.print("Calculadora enciende");
}
public double suma(double a, double b) {
      return a + b; }
public double resta(double a, double b) {
      return a - b;
    }
  
 public double multiplicacion(double a, double b) {
      return a * b;
    }
  
public double division(double a, double b) {
      return a / b;
    }
}