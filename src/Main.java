import java.util.Scanner;

class Feedback {
    String customerName;
    String message;
    int rating;

    public Feedback(String customerName, String message, int rating) {
        this.customerName = customerName;
        this.message = message;
        this.rating = rating;
    }

    public void display() {
        System.out.println("\n---- CUSTOMER FEEDBACK ----");
        System.out.println("Name: " + customerName);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Message: " + message);
    }
}

class UseCase12Feedback {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter rating (1-5): ");
        int rating = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your feedback/complaint: ");
        String msg = sc.nextLine();

        Feedback feedback = new Feedback(name, msg, rating);

        System.out.println("\nThank you for your feedback!");
        feedback.display();
    }
}