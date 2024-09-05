import java.util.*;

class TrainBooking {
    private static final int TOTAL_SEATS = 80;
    private static final int SEATS_PER_ROW = 7;
    private static final int LAST_ROW_SEATS = 3;
    private static boolean[] seats = new boolean[TOTAL_SEATS];

    static {
        // Initialize seats with some already booked
        seats[0] = true;
        seats[5] = true;
        seats[10] = true;
        seats[15] = true;
        seats[20] = true;
        seats[25] = true;
        seats[30] = true;
        seats[35] = true;
        seats[40] = true;
        seats[45] = true;
        seats[50] = true;
        seats[55] = true;
        seats[60] = true;
        seats[65] = true;
        seats[70] = true;
        seats[75] = true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of seats to book:");
        int numSeats = scanner.nextInt();
        bookSeats(numSeats);
        displaySeats();
    }

    private static void bookSeats(int numSeats) {
        int booked = 0;
        for (int i = 0; i < TOTAL_SEATS && booked < numSeats; i++) {
            if (!seats[i]) {
                seats[i] = true;
                booked++;
                System.out.print("Seat " + (i + 1) + " booked. ");
            }
        }
        System.out.println();
    }

    private static void displaySeats() {
        System.out.println("Seat availability:");
        for (int i = 0; i < TOTAL_SEATS; i++) {
            if (seats[i]) {
                System.out.print("X ");
            } else {
                System.out.print((i + 1) + " ");
            }
            if ((i + 1) % SEATS_PER_ROW == 0 && i != TOTAL_SEATS - LAST_ROW_SEATS) {
                System.out.println();
            }
        }
        System.out.println();
    }
}