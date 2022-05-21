import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    
		Scanner sm = new Scanner (System.in);
		Scanner cm = new Scanner (System.in);

		System.out.println("Introduce la marca: "); 
		String mrca = sm.nextLine();
		System.out.println("Introduce el color: ");
		String clor = cm.nextLine();
CalculadoraBasica casio = new CalculadoraBasica ();
		casio.setMarca(mrca);
		casio.setColor(clor);

		System.out.println("");
		System.out.println("Marca: " + casio.getMarca());
		System.out.println("Color: " + casio.getColor());
System.out.println("Suma: " + casio.suma(6.5, 9));
		System.out.println("Resta: " + casio.resta(11,2));
System.out.println("Multiplicacion: " + casio.mult(9, 9));
		System.out.println("Division: " + casio.div(29.6, 4));
     }
}