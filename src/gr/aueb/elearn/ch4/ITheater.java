package gr.aueb.elearn.ch4;

public interface ITheater {
    boolean reservedSeat(String seatNumber) throws IsReservedException;
    boolean cancelReservation(String seatNumber) throws IsNotReservedException;
    void printSeats();
}
