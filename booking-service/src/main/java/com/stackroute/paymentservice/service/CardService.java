package com.stackroute.paymentservice.service;

import com.stackroute.paymentservice.domain.CardDetails;


public interface CardService {

   CardDetails saveCardDetails(CardDetails cardDetails);

}