import java.util.Scanner;

class Room {
    protected int type;
    protected boolean isAvailable = true;

    public Room(int type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkIn() {
        isAvailable = false;
    }

    public void display() {
        System.out.println("Room Type: " + type + " | Available: " + isAvailable);
    }
}

class Booking {
    String customerName;
    int roomType;

    public Booking(String customerName, int roomType) {
        this.customerName = customerName;
        this.roomType = roomType;
    }

    public void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Room Type: " + roomType);
    }
}

class UseCase7CheckIn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Room[] rooms = {
                new Room(1),
                new Room(2),
                new Room(3)
        };

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter booked room type (1-3): ");
        int type = sc.nextInt();

        if (type < 1 || type > 3) {
            System.out.println("Invalid room type");
            return;
        }

        Room selectedRoom = rooms[type - 1];

        if (!selectedRoom.isAvailable()) {
            System.out.println("Room already occupied!");
            return;
        }

        Booking booking = new Booking(name, type);

        selectedRoom.checkIn();

        System.out.println("\nCheck-In Successful!");
        booking.display();
        System.out.println("Room status updated.");
    }
}}