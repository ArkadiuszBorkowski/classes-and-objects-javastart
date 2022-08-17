package logik;

import data.Car;

import java.util.Scanner;

class CarShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car audiA5 = new Car(2017, "Audi", "A5", "Czarne");
        Car audiA4 = new Car(2015, "Audi", "A4");
        //w międzyczasie klient wybiera kolor:
        audiA4.setColor("Czerwony");

        audiA4.print();
        audiA5.print();

        int audiA4Year = audiA4.getYear();
        System.out.println("Audi jest z roku:" + audiA4Year);

        audiA5.setYear(2015);
        System.out.println("Rocznik: " + audiA5.getYear()); //2015
        //próbujemy znowu przestawić
        audiA5.setYear(-500); //komunikat w konsoli
        System.out.println("Rocznik: " + audiA5.getYear()); //2015

    }

}