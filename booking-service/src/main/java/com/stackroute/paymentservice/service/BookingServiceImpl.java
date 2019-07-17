package com.stackroute.paymentservice.service;


import com.stackroute.paymentservice.domain.Booking;
import com.stackroute.paymentservice.domain.MyUser;
import com.stackroute.paymentservice.exceptions.BookedSpaceNotFound;
import com.stackroute.paymentservice.exceptions.SpaceAlreadyBooked;
import com.stackroute.paymentservice.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookingServiceImpl implements BookingService{
    BookingRepository bookingRepository;


    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> getAllBookedSpace() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking bookedSpace(Booking booking) throws SpaceAlreadyBooked {
        if (bookingRepository.existsByBookingId(booking.getBookingId())) {
            throw new SpaceAlreadyBooked("space already booked ");
        }
        Booking bookedSpace = bookingRepository.save(booking);
        return bookedSpace;
    }

    @Override
    public boolean deleteBookedSpace(int bookingId) throws BookedSpaceNotFound {
        boolean status = false;
        System.out.println("***********bookingidddd" + bookingId);
        if (bookingRepository.existsByBookingId(bookingId)) {
            bookingRepository.deleteByBookingId(bookingId);
            status = true;
            return status;
        } else {
            throw new BookedSpaceNotFound("Booked Space Not exists");
        }

    }

    @Override
    public Booking findByName(String name) {
        return bookingRepository.findByName(name);
    }


}
