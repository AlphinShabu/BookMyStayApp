import java.util.Scanner;

class Booking {
    int bookingId;
    String customerName;
    int roomType;
    String checkIn;
    String checkOut;
    double amount;

    public Booking(int bookingId, String customerName, int roomType, String checkIn, String checkOut, double amount) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.roomType = roomType;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.amount = amount;
    }

    public void displayReceipt() {
        System.out.println("\n----- BOOKING RECEIPT -----");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Check-in: " + checkIn);
        System.out.println("Check-out: " + checkOut);
        System.out.println("Total Amount: Rs." + amount);
        System.out.println("---------------------------");
    }
}

public class UseCase11Receipt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Booking ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Room Type (1-3): ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Check-in Date: ");
        String checkIn = sc.nextLine();

        System.out.print("Enter Check-out Date: ");
        String checkOut = sc.nextLine();

        System.out.print("Enter Total Amount: ");
        double amount = sc.nextDouble();

        Booking booking = new Booking(id, name, type, checkIn, checkOut, amount);

        booking.displayReceipt();
    }
}