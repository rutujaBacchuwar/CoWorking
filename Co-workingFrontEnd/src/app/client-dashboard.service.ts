import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ClientDashboardService {

  constructor(private httpClient:HttpClient) { }

  getClientData():any{
    return this.httpClient.get("http://localhost:3000/Client-Details")
  }
  getdetails():any{
    return this.httpClient.get("http://localhost:3000/details")
  }

  getSpaceDetailsByUserName(username):any{
    return this.httpClient.get(`http://localhost:8090/api/v1/space/${username}`);
  }
}
