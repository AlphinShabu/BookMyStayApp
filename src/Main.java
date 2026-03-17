class Room {
    protected int type;
    protected double price;
    protected boolean isBooked;

    public Room(int type, double price, boolean isBooked) {
        this.type = type;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void display() {
        System.out.println("Room Type: " + type +
                " | Price: " + price +
                " | Booked: " + isBooked);
    }
}
 class UseCase10Reports {

    public static void main(String[] args) {

        Room[] rooms = {
                new Room(1, 1500, true),
                new Room(2, 2500, true),
                new Room(3, 5000, false)
        };

        int totalBooked = 0;
        double totalRevenue = 0;

        System.out.println("---- HOTEL REPORT ----");

        for (int i = 0; i < rooms.length; i++) {
            rooms[i].display();

            if (rooms[i].isBooked) {
                totalBooked++;
                totalRevenue += rooms[i].price;
            }
        }

        System.out.println("\nTotal Booked Rooms: " + totalBooked);
        System.out.println("Total Revenue: Rs." + totalRevenue);
    }
}