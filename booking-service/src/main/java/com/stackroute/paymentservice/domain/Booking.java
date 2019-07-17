package com.stackroute.paymentservice.domain;

import com.stackroute.kafka.Space;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Booking {

    @Id
    private int bookingId;
    private boolean status;
//    private MySpace mySpace;
//    private MyCategory myCategory;
    private MyUser myUser;

    public Booking() {
    }

    public Booking(int bookingId, boolean status, MyUser myUser) {
        this.bookingId = bookingId;
        this.status = status;
//        this.mySpace = mySpace;
//        this.myCategory = myCategory;
        this.myUser = myUser;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

//    public MySpace getMySpace() {
//        return mySpace;
//    }
//
//    public void setMySpace(MySpace mySpace) {
//        this.mySpace = mySpace;
//    }

    public MyUser getMyUser() {
        return myUser;
    }

    public void setMyUser(MyUser myUser) {
        this.myUser = myUser;
    }

//    public MyCategory getMyCategory() {
//        return myCategory;
//    }
//
//    public void setMyCategory(MyCategory myCategory) {
//        this.myCategory = myCategory;
//    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", status=" + status +
//                ", mySpace=" + mySpace +
//                ", myUser=" + myUser +
//                ", myCategory=" + myCategory +
                '}';
    }
}
