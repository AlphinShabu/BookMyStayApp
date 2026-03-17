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

    public void display() {
        System.out.println("Type: " + type + " | Size: " + size + " | Price: " + price + " | Available: " + isAvailable);
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

class UseCase5ViewRooms {

    public static void main(String[] args) {

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
    }
}