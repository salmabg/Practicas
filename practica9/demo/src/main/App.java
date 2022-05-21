package main;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
public static void main(String[] args) throws Exception {
        System.out.println("Selecciona la opcion 1,2,3,4,5");
        Scanner op = new Scanner(System.in);
        int opcion = op.nextInt();
        Scanner sm = new Scanner(System.in);
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner letra = new Scanner(System.in);

        switch(opcion) {
            case 1:
                System.out.println("introduce la oracion");
                String palablra = sm.nextLine();
                char[] arreglo = palablra.toCharArray();
                System.out.println("introduce la primera pocicion");
                int num1 = n1.nextInt();
                System.out.println("introduce la segunda pocicion");
                int num2 = sm.nextInt();

                ArrayList<Character> subPalabra = opcion1(arreglo, num1, num2);
                int subPalabraString = subPalabra.size();
                for (int i = 0; i < subPalabraString; i++) {
                    System.out.print(subPalabra.get(i));
                }
                break;
            case 2:
                System.out.println("introduce la oracion");
                String palablra2 = sm.nextLine();
                char[] arreglo2 = palablra2.toCharArray();
                opcion2(arreglo2);
                break;
            case 3:
                System.out.println("introduce los caracteres");
                String palablra3 = sm.nextLine();
                char[] arreglo3 = palablra3.toCharArray();
                System.out.println("N para mayuscula / M para mayucula");
                String conversor = letra.nextLine();
                opcion3(arreglo3, conversor);
                break;
            case 4:
                ArrayList<String> arreglo4 = new ArrayList<String>(5); 
                for (int i = 0; i < 5; i++) {
                    System.out.println("introduce las palabras");
                    String palablra4 = sm.nextLine();
                    arreglo4.add(palablra4);
                }
                System.out.println("Letra inicial");
                char caracter1 = letra.nextLine().charAt(0);
                opcion5(arreglo4, caracter1);
                break;
            case 5:
                ArrayList<String> arreglo5 = new ArrayList<String>(5); 
                for (int i = 0; i < 5; i++) {
                    System.out.println("introduce las palabras");
                    String palablra5 = sm.nextLine();
                    arreglo5.add(palablra5);
                }
                System.out.println("Letra final");
                char caracter2 = letra.nextLine().charAt(0);
                opcion5(arreglo5, caracter2);
                break;
            default: 
                System.out.println("error");
        }
        op.close();
        sm.close();
        n1.close();
        n2.close();
        letra.close();
    }
public static ArrayList<Character> opcion1(char[] arreglo, int num1, int num2){
        ArrayList<Character> retrno = new ArrayList<Character>();
        for (int i = 0; i < arreglo.length; i++) {
            if (i >= num1 && i <= num2 ) {
                 retrno.add(arreglo[i]);
            }
        }   
        return retrno;
    }
public static void opcion2(char[] arreglo){
        char car = ' ';
        String palabra = String.valueOf(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            if (String.valueOf(palabra.charAt(i)).matches("[0-9]*")) {
                System.out.println(palabra.substring(i, i + 1) + " " + "es numero");
            }else if(palabra.substring(i, i + 1).matches("[a-z]*")){
                System.out.println(palabra.substring(i, i + 1) + " " + "es letra");
            }else if (arreglo[i] == car) {
                System.out.println(arreglo[i] + " " + "es espacio");
            }
        }
    }
public static void opcion3(char[] arreglo, String conversor){

        for (char e : arreglo) {

            if (conversor.substring(0, 1).matches("M")) {
                System.out.println(String.valueOf(e).toUpperCase());
            } else if (conversor.substring(0, 1).matches("N")) {
                System.out.println(String.valueOf(e).toLowerCase());
            } else {
                System.out.println("valor invalido");
                System.out.println(conversor);
                break;
            } 

        }
    }

public static void opcion4(ArrayList<String> arreglo, char caracter){
        int contador = 0;
        for (String e : arreglo) {
            
            if (e.substring(0, 1).matches(String.valueOf(caracter))) {
                contador++;
            }
        }
        System.out.println("Las palablas que emopiezan con la letra " + caracter + ": " + " son: " + contador);
    }
 public static void opcion5(ArrayList<String> arreglo, char caracter){
        int contador = 0;
        for (String e : arreglo) {
            if (e.substring( e.length() - 1 , e.length()).matches(String.valueOf(caracter))) {
                contador++;
            }
        }
        System.out.println("Las palablas que terminan con la letra " + caracter + ": " + " son: " + contador);
    }
}






