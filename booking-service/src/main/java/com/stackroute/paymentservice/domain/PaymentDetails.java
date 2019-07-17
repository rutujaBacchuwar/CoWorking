package com.stackroute.paymentservice.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Document
public class PaymentDetails implements Serializable {

//    private String paymentId;

    @Id
    private int bookingId;
    private boolean status;

    private String name;
    private int spaceId;
    private String spaceName;
    private BigDecimal totalprice;

    private int categoryId;
    private String categoryName;
    private BigDecimal price;



}