import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CardService {
  constructor(private httpclient: HttpClient) { }

  // getTrainingRoom(): any {
  //   return this.httpclient.get("http://localhost:3000/trainingroom");
  // }

  // getHotDesk(): any {
  //   return this.httpclient.get("http://localhost:3000/hotdesk")
  // }

  // getCategory1(): any {
  //   return this.httpclient.get("http://localhost:3000/category1")
  // }

  getByCategory(category): any {
    console.log("in category"+category);
    return this.httpclient.get(`http://localhost:8005/api/v1/category/${category}`);
  }
  getSpaceDetails(name):any{
    return this.httpclient.get(`http://localhost:8005/api/v1/space/${name}`)
  }
}
