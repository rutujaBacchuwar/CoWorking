package com.stackroute.paymentservice.repository;

import com.stackroute.paymentservice.domain.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface BookingRepository extends MongoRepository<Booking, Integer> {

//    Booking getByName(String name);
    boolean existsByBookingId(int bookingId);
    void deleteByBookingId(int bookingId);

    @Query("{'myUser.name':'?0'}")
    Booking findByName(String name);
}
