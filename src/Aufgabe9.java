import java.util.Scanner;

public class Aufgabe9 {
    public static void main (String [] args ){
        System.out.println("Bitte geben Sie die zurückgelegten Kilometer an:");
        Scanner numberKm = new Scanner (System.in);
        double km = numberKm.nextDouble();
        System.out.println("Bitte geben Sie die benötigte Treibstoffmenge an:");
        Scanner numberFuel = new Scanner (System.in);
        double fuel = numberFuel.nextDouble();
        double fuel1Km = fuel / km;
        double fuel100Km = fuel1Km * 100;
        fuel100Km = Math.round(fuel100Km*100.00) / 100.00;
        System.out.println("Der Verbrauch auf 100km beträgt " + fuel100Km +  " L ");
    }
}
