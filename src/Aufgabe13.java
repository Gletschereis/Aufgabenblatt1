import java.util.Scanner;

public class Aufgabe13 {
    public static void main (String [] args ){
        System.out.println("Bitte geben Sie einen Geldbetrag ein: ");
        Scanner numbermoney = new Scanner(System.in);
        int money = numbermoney.nextInt();
        while (money % 5 != 0 ){
            System.out.println("Bitte wählen Sie einen anderen Betrag:");
            money = numbermoney.nextInt();
        }
        int hundert = 0;
        int fuenfzig = 0;
        int zwanzig =  0;
        int zehn = 0;
        int fuenf = 0;
        if (money >= 100){
            hundert = money / 100;
            money = money - hundert * 100;
        }
        if (money >= 50){
            fuenfzig = money / 50;
            money = money - fuenfzig * 50;
        }
        if (money >= 20){
            zwanzig = money / 20;
            money = money - zwanzig * 20;
        }
        if (money >= 10){
            zehn = money / 10;
            money = money - zehn * 10;
        }
        if (money == 5 ){
            fuenf = 1;
            money -= 5;
        }
        System.out.println("Sie erhalten:");
        System.out.println(hundert + " x 100");
        System.out.println(fuenfzig + " x 50");
        System.out.println(zwanzig + " x 20");
        System.out.println(zehn + " x 10");
        System.out.println(fuenf + " x 5");
    }
}
