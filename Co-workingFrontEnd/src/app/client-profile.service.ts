import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ClientProfileService {

  constructor(private httpClient:HttpClient) { }

  // getClientData():any{
  //   return this.httpClient.get("http://localhost:3000/client-recommendation-details")
  //  }

  getClientData(address):any{
    return this.httpClient.get(`http://localhost:8006/v1/api/space/location/${address}`);
  }

  //  getdetails():any{
  //   return this.httpClient.get("http://localhost:3000/clientname")
  
  // }

  getClientDataBasedOnPrice():any{
    return this.httpClient.get(`http://localhost:8006/v1/api/contains/priceRecommendation`)

  }

  getClientDataBasedOnLocation():any{
    return this.httpClient.get('http://localhost:8006/v1/api/located/recommendationLoc')
  }
}
