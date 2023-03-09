package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        validateIfDatesAreFuture(checkin, checkout);
        validateIfCheckoutIsAfterCheckin(checkin, checkout);
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void updateDates(Date checkin, Date checkout) {
        validateIfDatesAreFuture(checkin, checkout);
        validateIfCheckoutIsAfterCheckin(checkin, checkout);
        this.checkin = checkin;
        this.checkout = checkout;
    }

    private void validateIfDatesAreFuture(Date checkin, Date checkout) {
        Date now = new Date();
        if(checkin.before(now) ||  checkout.before(now)) {
            throw new DomainException("The dates must be future dates");
        }
    }

    private void validateIfCheckoutIsAfterCheckin(Date checkin, Date checkout) {
        if (!checkout.after(checkin)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
    }

    public Long duration() {
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.MILLISECONDS.toDays(diff);
    }

    @Override
    public String toString() {
        return "Room " + roomNumber
                +", check-in: " + sdf.format(checkin)
                +", check-out: " + sdf.format(checkout)
                + ", " + duration() + " nights";
    }
}
