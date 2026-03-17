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

    public void checkOut() {
        isAvailable = true;
    }

    public void display() {
        System.out.println("Room Type: " + type + " | Available: " + isAvailable);
    }
}

class UseCase8CheckOut {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Room[] rooms = {
                new Room(1),
                new Room(2),
                new Room(3)
        };

        // Simulate already checked-in rooms
        rooms[0].checkIn();
        rooms[1].checkIn();

        System.out.println("Occupied Rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i].isAvailable()) {
                System.out.print((i + 1) + ". ");
                rooms[i].display();
            }
        }

        System.out.print("Enter room number to checkout (1-3): ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid choice");
            return;
        }

        Room selectedRoom = rooms[choice - 1];

        if (selectedRoom.isAvailable()) {
            System.out.println("Room is already empty.");
        } else {
            selectedRoom.checkOut();
            System.out.println("Check-Out Successful!");
        }

        System.out.println("\nUpdated Room Status:");
        for (int i = 0; i < rooms.length; i++) {
            System.out.print((i + 1) + ". ");
            rooms[i].display();
        }
    }
}