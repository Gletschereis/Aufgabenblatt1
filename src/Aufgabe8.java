import java.util.Scanner;

public class Aufgabe8 {
    public static void main (String [] args ){
        System.out.println("Bitte geben Sie den Radius des Kreises an:");
        Scanner numberRadius = new Scanner (System.in);
        double r = numberRadius.nextDouble();
        double fläche = Math.pow(r, 2) + Math.PI;
        double umfang = 2 * r * Math.PI;
        System.out.println("Die Fläche des Kreises beträgt " + (float) fläche);
        System.out.println("Der Umfang des Kreises beträgt "+ (float) umfang);
    }
}
