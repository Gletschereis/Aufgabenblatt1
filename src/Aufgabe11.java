import java.util.Scanner;

public class Aufgabe11 {
    public static void main (String [] args ){
        System.out.println("Bitte geben Sie die Klausurpunkte des Studierenden ein:");
        Scanner numberPoint = new Scanner(System.in);
        int points = numberPoint.nextInt();
        if (points <= 200){
            System.out.println("Nicht Genügend");
        } else if (points <= 250){
            System.out.println("Genügend");
        } else if (points <= 300){
            System.out.println("Befriedigend");
        } else if (points <= 350){
            System.out.println("Gut");
        } else if (points <= 400 ){
            System.out.println("Sehr Gut");
        } else {
            System.out.println("Da ist wohl etwas schief gegangen");
        }

    }
}
