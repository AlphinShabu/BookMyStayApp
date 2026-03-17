import java.util.Scanner;

class Room {
    protected int type;
    protected double price;
    protected boolean isAvailable = true;

    public Room(int type, double price) {
        this.type = type;
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        isAvailable = false;
    }

    public void display() {
        System.out.println("Type: " + type + " | Price: " + price + " | Available: " + isAvailable);
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 1500.0);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 2500.0);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 5000.0);
    }
}

class Booking {
    String name;
    int roomType;
    String checkIn;
    String checkOut;

    public Booking(String name, int roomType, String checkIn, String checkOut) {
        this.name = name;
        this.roomType = roomType;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public void display() {
        System.out.println("\nBooking Details:");
        System.out.println("Customer Name: " + name);
        System.out.println("Room Type: " + roomType);
        System.out.println("Check-in: " + checkIn);
        System.out.println("Check-out: " + checkOut);
    }
}

class UseCase6Booking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Room[] rooms = {
                new SingleRoom(),
                new DoubleRoom(),
                new SuiteRoom()
        };

        System.out.println("Available Rooms:");
        for (int i = 0; i < rooms.length; i++) {
            System.out.print((i + 1) + ". ");
            rooms[i].display();
        }

        System.out.print("Select room (1-3): ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid choice");
            return;
        }

        Room selectedRoom = rooms[choice - 1];

        if (!selectedRoom.isAvailable()) {
            System.out.println("Room not available");
            return;
        }

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter check-in date: ");
        String checkIn = sc.nextLine();

        System.out.print("Enter check-out date: ");
        String checkOut = sc.nextLine();

        Booking booking = new Booking(name, selectedRoom.type, checkIn, checkOut);

        selectedRoom.bookRoom();

        System.out.println("\nBooking Successful!");
        booking.display();
    }
}