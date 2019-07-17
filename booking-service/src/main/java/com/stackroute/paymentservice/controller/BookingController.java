package com.stackroute.paymentservice.controller;


import com.stackroute.paymentservice.domain.*;
import com.stackroute.paymentservice.exceptions.BookedSpaceNotFound;
import com.stackroute.paymentservice.exceptions.SpaceAlreadyBooked;
import com.stackroute.paymentservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1")
public class BookingController {


    BookingService bookingService;

    MyUser user=new MyUser();
    MySpace space=new MySpace();
    MyCategory category=new MyCategory();
//    MyLocation location=new MyLocation();
    Booking booking=new Booking();

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("book")
    public ResponseEntity<?> bookedSpace(@RequestBody Booking booking) throws BookedSpaceNotFound {
        user=booking.getMyUser();
        booking.setMyUser(user);
//        space=booking.getMySpace();
//        booking.setMySpace(space);
//        category=booking.getMyCategory();
//        booking.setMyCategory(category);

        System.out.println("Booking object:"+booking.toString() );


        ResponseEntity responseEntity;
        try {
            bookingService.bookedSpace(booking);
            responseEntity = new ResponseEntity<Booking>( booking , HttpStatus.CREATED);

        } catch (SpaceAlreadyBooked ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);

        }
        return responseEntity;
    }


    @GetMapping("books")
    public ResponseEntity<?> getAllBookedSpace() {
        return new ResponseEntity<List<Booking>>(bookingService.getAllBookedSpace(), HttpStatus.OK);
    }



    @DeleteMapping("book/{bookingId}")
    public ResponseEntity<?> deleteBookedSpace(@PathVariable("bookingId") int bookingId) throws BookedSpaceNotFound {
        {
            ResponseEntity responseEntity;
            try {
                bookingService.deleteBookedSpace(bookingId);
                responseEntity = new ResponseEntity<String>("Deleted Booked Space successfully", HttpStatus.OK);
            } catch (BookedSpaceNotFound exception) {
                responseEntity = new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
            }
            return responseEntity;
        }

    }

    @GetMapping("books/{name}")
    public ResponseEntity<Booking> getByName(@PathVariable String name){
        System.out.println("dsfddsgdhjm");
        ResponseEntity responseEntity=new ResponseEntity<Booking>(bookingService.findByName(name), HttpStatus.OK);
        return responseEntity;
    }

}
