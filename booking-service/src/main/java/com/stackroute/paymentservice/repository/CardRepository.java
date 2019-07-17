package com.stackroute.paymentservice.repository;

import com.stackroute.paymentservice.domain.CardDetails;
import com.stackroute.paymentservice.domain.PaymentDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardRepository extends MongoRepository<CardDetails, Integer>{

//    public  CardDetails save(CardDetails cardDetails);
}


