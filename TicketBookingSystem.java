import java.util.Scanner;

class TicketBookingSystem {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    TicketBookingSystem(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.1;
        } else {
            return 0.0;
        }
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        
        System.out.println("===== CINEMA TICKET BILL =====");
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: $%.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount: $%.2f%n", calculateTotal());
        System.out.printf("Discount: $%.2f%n", calculateDiscount());
        System.out.printf("Final Amount to Pay: $%.2f%n", calculateFinalAmount());
        System.out.println("================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = scanner.nextDouble();

        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = scanner.nextInt();

        TicketBookingSystem ticket = new TicketBookingSystem(movieName, ticketPrice, numberOfTickets);
        ticket.displayBill();

        scanner.close();
    }
}