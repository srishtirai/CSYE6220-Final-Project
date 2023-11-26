package com.csye6200.finalprojectesd.model;

import java.util.Date;

public class Booking {
    private long id;
    private User user;
    private Showtime showTime;
    private int numberOfTickets;
    private Date bookingDateTime;

    public Booking() {
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Showtime getShowTime() {
		return showTime;
	}

	public void setShowTime(Showtime showTime) {
		this.showTime = showTime;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public Date getBookingDateTime() {
		return bookingDateTime;
	}

	public void setBookingDateTime(Date bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}

}
