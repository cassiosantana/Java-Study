package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.nextLine());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.nextLine());
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);

            System.out.println("Reservation: " + reservation);

            System.out.println("\nEnter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.nextLine());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.nextLine());

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reservation);

        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        } catch (DomainException e) {
            System.out.println("Error when making a reservation: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Wrong data type: enter a number");
        }

    }
}
