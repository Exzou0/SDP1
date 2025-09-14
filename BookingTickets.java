public class BookingTickets {
    private final String title;
    private final String duration;
    private final String priceInDollars;

    private BookingTickets (Builder builder) {
      this.title = builder.title;
      this.duration = builder.duration;
      this.priceInDollars = builder.priceInDollars;
  }
  public static class Builder {
        private String title;
        private String duration;
        private String priceInDollars;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }
        public Builder setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public Builder setPriceInDollars(String priceInDollars) {
            this.priceInDollars = priceInDollars;
            return this;
        }
        public BookingTickets Build() {
            return new BookingTickets(this);
        }
  }
  @Override
    public String toString() {
        return "Booking [Title= " + title + ", Duration= " + duration + ", Price= " + priceInDollars + "]";
}
}
