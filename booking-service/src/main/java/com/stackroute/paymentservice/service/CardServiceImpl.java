package com.stackroute.paymentservice.service;


import com.stackroute.paymentservice.domain.CardDetails;
import com.stackroute.paymentservice.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    private CardRepository cardRepository;

    @Autowired
    public CardServiceImpl(CardRepository cardRepository){

        this.cardRepository = cardRepository;
    }


    @Override
    public CardDetails saveCardDetails(CardDetails cardDetails) {
        return cardRepository.save(cardDetails);
    }


}
