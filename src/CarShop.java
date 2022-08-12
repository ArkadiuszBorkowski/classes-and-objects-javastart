import java.util.Scanner;

class CarShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car audi = new Car();
        System.out.println("Podaj markę samochodu:");
        audi.brand = scanner.next();

        System.out.println("Podaj model samochodu:");
        audi.model = scanner.next();

        System.out.println("Podaj kolor samochodu:");
        audi.carColor = scanner.next();

        System.out.println("Podaj kolor kół samochodu:");
        audi.tiresColor = scanner.next();

        System.out.println("Podaj liczbę drzwi samochodu:");
        audi.doors = scanner.nextInt();

        System.out.println("Podaj kolor felg samochodu:");
        audi.wheelsColor = scanner.next();

        String audiInfo = audi.brand + " " + audi.model
                + ", Drzwi: " + audi.doors
                + ", Kolor nadwozia: " + audi.carColor
                + ", Kolor felg: " + audi.wheelsColor
                + ", Kolor opon: " + audi.tiresColor;
        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(audiInfo);
    }
}
