import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class OwnerDashboardService {


  constructor(private httpClient:HttpClient) { }

  getOwnerData():any{
    return this.httpClient.get("http://localhost:3000/Owner-Details")
  }

  getSpaceData():any{
    return this.httpClient.get("http://localhost:3000/Space-Details");
  }
}

