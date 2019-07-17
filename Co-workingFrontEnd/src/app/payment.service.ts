import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {




constructor(private http: HttpClient) { }

  chargeCard(token: string) {

    const headers = new Headers ({ 'token': "token"});

    this.http.post('http://localhost:8099/api/v1/charge', {})
      .subscribe(resp => {
        console.log(resp);
      });
  }
}