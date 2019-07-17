//package com.stackroute.paymentservice.service;
//
//import com.stackroute.paymentservice.domain.ChargeRequest;
//import com.stackroute.paymentservice.domain.PaymentDetails;
//import com.stripe.exception.*;
//import com.stripe.model.Charge;
//
//public interface PaymentService {
//
//    public Charge charge(ChargeRequest chargeRequest) throws AuthenticationException, InvalidRequestException,
//            APIConnectionException, CardException, APIException;
//    public PaymentDetails savePaymentDetails(PaymentDetails paymentDetails);
//
//}