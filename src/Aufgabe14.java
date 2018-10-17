import java.util.Scanner;

public class Aufgabe14 {
    public static void main (String [] args){
        System.out.println("Bitte geben Sie einen Wochentag als Ganzzahl ein:");
        Scanner numberWeekday = new Scanner(System.in);
        byte weekday = numberWeekday.nextByte();
        while (weekday > 7 || weekday < 0 ){
            System.out.println("Ungültige Eingabe");
            weekday = numberWeekday.nextByte();
        }
        switch (weekday){
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
        }
    }
}
