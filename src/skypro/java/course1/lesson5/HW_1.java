package skypro.java.course1.lesson5;

public class HW_1 {
    public static void main(String[] args) {
        //ДЗ-1 Задача 1
        int ageFirst = 20;
        if (ageFirst <= 18) {
            System.out.println("Возраст совершеннолетия не достигнут, пожалуйста, ожидайте.");
        }
        if (ageFirst > 18) {
            System.out.println("Поздравляем с достижением совершеннолетия!");
        }

        //ДЗ-1 Задача 2
        int ageSecond = 24;
        if (ageSecond < 7) {
            System.out.println("\nПользователь не достиг школьного возраста.");
        }
        if (ageSecond >= 7 && ageSecond < 18) {
            System.out.println("\nПользователь ходит в школу.");
        }
        if (ageSecond >= 18 && ageSecond < 24) {
            System.out.println("\nПользователь закончил школу и может поступать в ВУЗ.");
        }
        if (ageSecond >= 24) {
            System.out.println("\nПользователь закончил ВУЗ и может искать первую работу.");
        }

        //ДЗ-1 Задача 3
        int capacityOfCar = 102;
        int seats = 60;
        int standingPlace = capacityOfCar - seats;
        int numberOfPassengersInSeats = 60;
        int numberOfPassengersInStandingPlace = 62;
        int totalNumberOfPassengers = numberOfPassengersInSeats + numberOfPassengersInStandingPlace;
        if (totalNumberOfPassengers < capacityOfCar) {
            System.out.println("\nЕсть свободные места:");
            if (numberOfPassengersInSeats < seats) {
                System.out.println("- есть сидячие места.");
            }
            if (numberOfPassengersInStandingPlace < standingPlace) {
                System.out.println("- есть стоячие места.");
            }
        }
        if (totalNumberOfPassengers >= capacityOfCar) {
            System.out.println("\nСвободных мест нет.");
        }
    }
}