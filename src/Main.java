class Room {
    protected int type;
    protected int size;
    protected double price;

    public Room(int type, int size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
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

class UseCase2RoomInitialization {

    public static void main(String[] args) {

        SingleRoom single = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suite = new SuiteRoom();

        int singleAvailable = 10;
        int doubleAvailable = 5;
        int suiteAvailable = 2;

        System.out.println("Room Types and Availability:");
        System.out.println("Single Room - Available: " + singleAvailable);
        System.out.println("Double Room - Available: " + doubleAvailable);
        System.out.println("Suite Room - Available: " + suiteAvailable);
    }
}