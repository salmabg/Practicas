import java.util.Scanner;
public class RunS2 {
private String color;
public String getColor() {
        return color;
    }
public void setColor(String color) {
        this.color = color;
    }
public static void main(String[] args) {
 Scanner sm = new Scanner(System.in);
System.out.println("introduce la marca");
        String mrca = sm.nextLine();

        calculadora_basica casio = new calculadora_basica();
        casio.setmarca(mrca);

        System.out.println(casio.getmarca());
        System.out.println(casio.suma(6.5, 9));
        System.out.println(casio.resta(10, 1));
        System.out.println(casio.multiplicacion(9, 9));
        System.out.println(casio.division(156, 20));
    }
}