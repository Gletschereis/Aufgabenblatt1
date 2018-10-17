import java.util.Scanner;

public class Aufgabe12 {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie eine Jahreszahl ein");
        Scanner numberYear = new Scanner(System.in);
        int year = numberYear.nextInt();
        if (year == 0){
            System.out.println("Schaltjahr");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Schaltjahr");
        } else if (year % 400 == 0) {
            System.out.println("Schaltjahr");
        } else {
            System.out.println("Kein Schaltjahr");
        }
    }
}
