// import java.util.Scanner;
public class runS3 {
public static void main(String[] args) {
Television television = new Television();

        television.encender();
        television.setMarca("hitachi");
        System.out.println("\n");
        System.out.println(television.getMarca());
        System.out.println(television.Color());
        System.out.println(television.CambiarCanal());
        System.out.println(television.CambiarVolumen());
        System.out.println(television.apagar());
        calculadora Calculadora = new calculadora();
        System.out.println("\n");

        // Scanner sm = new Scanner(System.in);

        // System.out.println("introduce la marca");
        // String mrca = sm.nextLine();

        Calculadora.encender();
        Calculadora.setMarca("casio");
        // Calculadora.setmarca(mrca);

        // System.out.println(Calculadora.getmarca());
        System.out.println("\n");
        System.out.println(Calculadora.getMarca());
        System.out.println(Calculadora.suma(6.5, 9));
        System.out.println(Calculadora.resta(10, 1));
        System.out.println(Calculadora.multiplicacion(9, 9));
        System.out.println(Calculadora.division(156, 20));
        System.out.println(Calculadora.apagar());
   }
}