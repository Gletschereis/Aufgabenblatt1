public class Aufgabe10 {
    public static void main (String [] args ){
        int fullDistance = 20;
        int kmFinished = 4;
        int restToHalfDistance = fullDistance / 2 - kmFinished;
        double h = 60 / 15;
        double kmPerHour = kmFinished * h;
        kmPerHour = Math.round(kmPerHour*100.00) / 100.00;
        System.out.println("Restliche Distanz bis zur Hälfte der Strecke " + restToHalfDistance + " KM ");
        System.out.println("KM/H auf den ersten 4km " + (int) kmPerHour + "km/h");
    }
}
