import java.util.Scanner;

public class Aufgabe15 {
    public static void main (String [] args ){
        System.out.println("Bitte geben Sie das zu versteuernde Jahrenseinkommen an:");
        Scanner numberIncome = new Scanner(System.in);
        int income = numberIncome.nextInt();
        double tax = 0;
        if (income <= 5000) {
            tax = income * 0.05;
        } else if (income <= 10000){
            tax = income * 0.22;
        } else if (income <= 15000){
            tax = income * 0.32;
        } else{
            tax = income * 0.44;
        }
        tax = Math.round(tax * 100.00) / 100.00;
        System.out.println("Die Steuer beträgt " +  tax + "€");
    }
}
