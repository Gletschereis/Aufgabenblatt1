import java.util.Scanner;

public class Aufgabe17 {
    static void printLine() {
        System.out.println("_________________________");
    }

    static final double TRESHHOLD = 0.0010;

    public static void main(String[] args) {
        System.out.println("Bitte geben Sie den Mittelpunkt des Kreises an :");
        Scanner circleX = new Scanner(System.in);
        int xC = Math.abs(circleX.nextInt());
        Scanner circleY = new Scanner(System.in);
        int yC = Math.abs(circleY.nextInt());
        System.out.println("Bitte geben Sie den Radius des Kreises an:");
        Scanner numberR = new Scanner(System.in);
        int r = Math.abs(numberR.nextInt());
        System.out.println("Bitte geben Sie noch eine Punkt an:");
        Scanner pointX = new Scanner(System.in);
        int xP = Math.abs(pointX.nextInt());
        Scanner pointY = new Scanner(System.in);
        int yP = Math.abs(pointY.nextInt());
        double a, b, c;
        if (xC >= xP) {
            a = xC - xP;
        } else {
            a = xP - xC;
        }
        if (yC >= yP) {
            b = yC - yP;
        } else {
            b = yP - yC;
        }
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if (c < r) {
            if (r - c < TRESHHOLD) {
                System.out.println("Punkt liegt auf dem Kreis");
            } else {
                System.out.println("Punkt liegt innerhalb des Kreises");
            }
        } else {
            if (c - r < TRESHHOLD) {
                System.out.println("Punkt liegt auf dem Kreis");
            } else {
                System.out.println("Punkt liegt außerhalb des Kreises");
            }
        }
    }
}
