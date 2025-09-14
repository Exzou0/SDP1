public class Main {
    public static void main(String[] args) {
        BookingTickets booking = new BookingTickets.Builder()
                .setTitle("Interstellar")
                .setDuration("2 hour and 30 min")
                .setPriceInDollars("10 dollars")
                .Build();

        System.out.println(booking.toString());
    }
}