package com.restfulbooker.modules;

import com.google.gson.Gson;
import com.restfulbooker.payloads.pojos.Booking;
import com.restfulbooker.payloads.pojos.BookingDates;

public class PayloadManager {

    // Java to JSON String (Serialization)
    public String createPayload() {

        String payload = null;

        Booking booking = new Booking();
        booking.setFirstname("Akash");
        booking.setLastname("Mali");
        booking.setTotalprice(1500);
        booking.setDepositpaid(true);
        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("2018-01-01");
        bookingDates.setCheckout("2018-02-01");
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Wifi");

        Gson gson = new Gson();
        payload = gson.toJson(booking);

        return payload;
    }
}
