import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SpaceService {

  
  constructor(private httpClient:HttpClient) { }

  getSpace():any{
    return this.httpClient.get("http://localhost:3000/space");
  }
}
