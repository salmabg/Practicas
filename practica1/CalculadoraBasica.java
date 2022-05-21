public class CalculadoraBasica extends Calculadora {
private String color;
public double div(double a, double b){
        return a/b;
    }
public double mult(double a, double b){
        return a * b;
    }
public String getColor() {
        return color;
    }
public void setColor(String color) {
        this.color = color;
		}
}