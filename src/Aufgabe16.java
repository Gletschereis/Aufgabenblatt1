import java.util.Scanner;

public class Aufgabe16 {
    static final double TRESHHOLD = 0.010;
    public static void main (String [] args ){
        System.out.println("Bitte geben Sie 3 Seitenlängen eines Dreiecks ein (a) (b) (c)");
        Scanner numberA = new Scanner (System.in);
        double a = numberA.nextDouble();
        Scanner numberB = new Scanner (System.in);
        double b = numberB.nextDouble();
        Scanner numberC = new Scanner (System.in);
        double c = numberC.nextDouble();
        if (a == b && b == c ){
            System.out.println("Gleichseitiges Dreieck");
        } else if (a == b || b == c || a == c){
            System.out.println("Gleichseitiges Dreieck");
        } else {
            System.out.println("Sonstiges Dreieck");
        }
        double aHelp =  Math.sqrt(Math.pow(c, 2) - Math.pow (b, 2));
        double bHelp = Math.sqrt (Math.pow (c, 2) - Math.pow (a, 2));
        double cHelp = Math.sqrt (Math.pow (a, 2) + Math.pow (b, 2));
        if (a > b && a > c ){
            if (aHelp > a ){
                if ((Math.abs(aHelp - a) < TRESHHOLD)){
                    System.out.println("Rechtwinklig");
                }
            } else{
                if (Math.abs (a - aHelp) < TRESHHOLD){
                    System.out.println("Rechtwinklig");
                }
            }
        }
        if (b > a && b > c ){
            if (bHelp > b ){
                if ((Math.abs(bHelp - b) < TRESHHOLD)){
                    System.out.println("Rechtwinklig");
                }
            } else{
                if (Math.abs (b - bHelp) < TRESHHOLD){
                    System.out.println("Rechtwinklig");
                }
            }
        }
        if (c > a && c > b ){
            if (cHelp > c ){
                if ((Math.abs(cHelp - c) < TRESHHOLD)){
                    System.out.println("Rechtwinklig");
                }
            } else{
                if (Math.abs (c - cHelp) < TRESHHOLD){
                    System.out.println("Rechtwinklig");
                }
            }
        }

    }
}
