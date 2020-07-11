package gr.aueb.elearn.ch4;

import java.util.Scanner;

public class TheaterDemo {
    private static Theater theater = new Theater("Acropolis", 10,12);
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;
        int choice;

        do {
            showMenu();
            String response = in.nextLine();
            if (response.matches("\\d")){
                choice = Integer.parseInt(response);
            }else {
                System.out.println("Λανθασμένη επιλογή");
                continue;
            }
            switch (choice) {
                case 1:
                    manageReservation();
                    break;
                case 2:
                    managedCancellation();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Παρακαλώ δώστε επιλογή 1-3");
            }
        } while (!exit);
        System.out.println("adios ");
    }

    public static void manageReservation(){
        try {
            System.out.println("Δώστε αριθμό θέσης");
            String response = in.nextLine();
            System.out.printf("%sΕπιτυχής καταχώριση ", theater.reservedSeat(response) ? "" : "Μη");
        } catch (IsReservedException e) {
            System.out.println("Η θέση είναι ήδη reserved");
        } finally {
            theater.printSeats();
        }
    }

    public static void managedCancellation(){
        try {
            System.out.println("Δώστε αριθμό θέσης");
            String response = in.nextLine();
            System.out.printf("%sΕπιτυχής ακύρωση ", theater.cancelReservation(response) ? "" : "Μη");
        } catch (IsNotReservedException e) {
            System.out.println("Η θέση είναι ήδη non-reserved");
        } finally {
            theater.printSeats();
        }
    }

    public static void showMenu(){
        System.out.println("Δώστε επιλογή");
        System.out.println("1: Κράτηση θέσης");
        System.out.println("2: Ακύρωση θέσης");
        System.out.println("3: έξοδος ");
    }
}
