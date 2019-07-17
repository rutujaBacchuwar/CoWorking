import { Component, OnInit } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';

// import { ChargeRequest } from '../chargeRequest.modal';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {
  [x: string]: any;
  chargeRequest: any;
  paymentService: any;
  message: string;


  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

 

  chargeCreditCard() {

    let form = document.getElementsByTagName("form")[0];
      (<
    any>window).Stripe.card.createToken({
        number: form.cardNumber.value,
        exp_month: form.expMonth.value,
        exp_year: form.expYear.value,
        cvc: form.cvc.value
      }, (status:
    number, response: any) => {

    if (status === 200) {

    let token = response.id;
          this.chargeCard(token);
        }
    else {
          console.log(response.error.message);
        }
      });
    }

}

