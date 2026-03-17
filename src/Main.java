import java.util.Scanner;

class Room {
    protected int type;
    protected double price;

    public Room(int type, double price) {
        this.type = type;
        this.price = price;
    }

    public double calculateBill(int days) {
        return price * days;
    }
}

class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Payment of Rs." + amount + " successful!");
    }
}

class UseCase9Billing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Room[] rooms = {
                new Room(1, 1500.0),
                new Room(2, 2500.0),
                new Room(3, 5000.0)
        };

        System.out.println("Room Types:");
        System.out.println("1. Single (1500/day)");
        System.out.println("2. Double (2500/day)");
        System.out.println("3. Suite (5000/day)");

        System.out.print("Select room type (1-3): ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid choice");
            return;
        }

        Room selectedRoom = rooms[choice - 1];

        System.out.print("Enter number of days stayed: ");
        int days = sc.nextInt();

        double totalBill = selectedRoom.calculateBill(days);

        System.out.println("Total Bill = Rs." + totalBill);

        Payment payment = new Payment(totalBill);

        System.out.print("Confirm payment? (yes/no): ");
        sc.nextLine();
        String confirm = sc.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            payment.processPayment();
            System.out.println("Checkout completed!");
        } else {
            System.out.println("Payment cancelled.");
        }
    }
}