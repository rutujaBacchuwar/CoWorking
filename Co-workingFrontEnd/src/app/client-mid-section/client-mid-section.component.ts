import { Component, OnInit } from '@angular/core';
import {ClientProfileService} from '../client-profile.service'

@Component({
  selector: 'app-client-mid-section',
  templateUrl: './client-mid-section.component.html',
  styleUrls: ['./client-mid-section.component.css']
})
export class ClientMidSectionComponent implements OnInit {
  ArrayOfClientData: any=[];
  arrayOfPriceRecommandation: any=[];
  arrayOfLocationRecommandation:any=[];
  address:string
 
  constructor(private clientprofileService:ClientProfileService) { }

  ngOnInit() {
  
    this.getRecommendationByGivingAddress();
    this.getRecommendationBasedOnPrice();
    this.getRecommendationBasedOnLocation();
  }

  getRecommendationByGivingAddress():any{
    this.address=sessionStorage.getItem('address');
    console.log(this.address);
    this.clientprofileService.getClientData(this.address).subscribe(data=>{
      console.log(data)
      this.ArrayOfClientData=data;
    });
  }

  getRecommendationBasedOnPrice():any{
    // this.address=sessionStorage.getItem('address');
    this.clientprofileService.getClientDataBasedOnPrice().subscribe(data=>{
      console.log("Price based Recommandation")
      this.arrayOfPriceRecommandation=data;
      console.log(data);
    });
  }

  getRecommendationBasedOnLocation():any{
    this.clientprofileService.getClientDataBasedOnLocation().subscribe(data=>
      {
        console.log("Location Based Recommandation")
        this.arrayOfLocationRecommandation=data;
        console.log(data);
      });
  }



}
