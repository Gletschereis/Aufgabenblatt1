import java.util.Scanner;

public class Aufgabe7 {
    public static void main (String [] args ){
        System.out.println("Bitte geben Sie einen Wert für die Variable (x) ein:");
        Scanner numberX = new Scanner(System.in);
        System.out.print("x: ");
        int x = numberX.nextInt();
        System.out.println("Bitte geben Sie einen Wert für die Variable (y) ein:");
        System.out.print("y:");
        Scanner numberY = new Scanner (System.in);
        int y = numberY.nextInt();
        double z = 2 * x + Math.pow(y, 2);
        String sign = "\u005E";
        System.out.println("Das Ergebnis von 2 * " + x + " + " + y + " " + sign + " 2 ergbibt " + (int) z + ".");
    }
}
