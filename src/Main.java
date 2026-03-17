import java.util.Scanner;

class Room {
    protected int type;
    protected int size;
    protected double price;
    protected boolean isAvailable = true;

    public Room(int type, int size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        isAvailable = false;
    }

    public void cancelBooking() {
        isAvailable = true;
    }

    public void display() {
        System.out.println("Type: " + type + " | Price: " + price + " | Available: " + isAvailable);
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}

class UseCase4CancelBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Room[] rooms = {
                new SingleRoom(),
                new DoubleRoom(),
                new SuiteRoom()
        };

        // Pre-book one room (simulate existing booking)
        rooms[0].bookRoom();

        System.out.println("Current Room Status:");
        for (int i = 0; i < rooms.length; i++) {
            System.out.print((i + 1) + ". ");
            rooms[i].display();
        }

        System.out.print("Select room to cancel booking (1-3): ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid choice");
            return;
        }

        Room selectedRoom = rooms[choice - 1];

        if (selectedRoom.isAvailable()) {
            System.out.println("Room is not booked.");
        } else {
            selectedRoom.cancelBooking();
            System.out.println("Booking cancelled successfully!");
        }

        System.out.println("Updated Room Status:");
        for (int i = 0; i < rooms.length; i++) {
            System.out.print((i + 1) + ". ");
            rooms[i].display();
        }
    }
}